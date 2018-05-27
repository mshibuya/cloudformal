package com.github.mshibuya.cloudformal.example

import com.github.mshibuya.cloudformal.aws.ec2
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy.DeletionPolicy

object ApplicationStack extends Stack {
  val name = "ApplicationStack"
  val description = "My stack"

  val instanceType = StringParameter("InstanceType", default = Value("m4.large"))

  val regionMap = StringMapping("RegionMap", Map(
    "us-east-1" -> Map("64" -> "ami-97785bed"),
    "ap-northeast-1" -> Map("64" -> "ami-ceafcba8"),
  ))

  val vpc = new ec2.VPC {
    override def logicalId: String = "SampleVPC"
    override def cidrBlock: NonEmptyProperty[String] = Value("10.0.0.0/16")
  }
  val subnet = new ec2.Subnet {
    override def logicalId: String = "SampleSubnet"
    override def cidrBlock: NonEmptyProperty[String] = Value("10.0.1.0/24")
    override def vpcId: NonEmptyProperty[String] = vpc.ref
  }
  val dbSubStack = new SubStack {
    val dbInstanceType = StringParameter("DbInstanceType", default = Value("m4.large"))
    val dbServer = new ec2.Instance {
      val logicalId = "DBServer"
      val imageId = regionMap.get(Value("ap-northeast-1"), Value("64"))
      override val instanceType = ApplicationStack.instanceType.ref
      override def subnetId: Property[String] = subnet.ref
    }

    val parameters: Seq[Parameter[_, _]] = Seq(dbInstanceType)
    val mappings: Seq[Mapping] = Nil
    val resources: Seq[Resource[_]] = Macros.resourcesIn(this)
    val outputs: Seq[Output[_]] = Nil
  }
  val appServer = new ec2.Instance {
    val logicalId = "AppServer"
    val imageId = regionMap.get(Value("ap-northeast-1"), Value("64"))
    override val instanceType = ApplicationStack.instanceType.ref
    override def subnetId: Property[String] = subnet.ref
    override val deletionPolicy = DeletionPolicy.Delete
    override val dependsOn = Seq(dbSubStack.dbServer)
  }

  val appServerInstanceId = Output("AppServerInstanceId", appServer.ref)
  val appServerPrivateIp = Output("AppServerPrivateIp", appServer.attributes.privateIp)
  val subnetId = ExportedOutput("SubnetId", "SubnetId", subnet.ref)

  val parameters: Seq[Parameter[_, _]] = Macros.parametersIn(this)
  val mappings = Seq(
    regionMap
  )
  val resources: Seq[Resource[_]] = Macros.resourcesIn(this)
  val outputs = Seq(
    appServerInstanceId,
    appServerPrivateIp,
    subnetId
  )
}