package com.github.mshibuya.cloudformal.example

import com.github.mshibuya.cloudformal.aws.ec2
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy.{CreationPolicy, DeletionPolicy, ResourceSignal}

object ApplicationStack extends Stack {
  val name = "ApplicationStack"
  val description = "My stack"

  val appServerInstanceType = StringParameter("AppServerInstanceType", default = Value("m4.large"))
  val parameters = Seq(
    appServerInstanceType
  )

  val regionMap = StringMapping("RegionMap", Map(
    "us-east-1" -> Map("32" -> "ami-11111111", "64" -> "ami-22222222")
  ))
  val mappings = Seq(
    regionMap
  )

  val dbServer = new ec2.Instance {
    val logicalId = "DBServer"
    val imageId = regionMap.get(Value("us-east-1"), Value("32"))
    override val instanceType = Fn.ImportValue(Value("DBServerInstanceType"))
  }
  val appServer = new ec2.Instance {
    val logicalId = "AppServer"
    val imageId = regionMap.get(Value("us-east-1"), Value("32"))
    override val instanceType = appServerInstanceType.ref
    override val creationPolicy = CreationPolicy(resourceSignal = ResourceSignal(count = Value(3)))
    override val deletionPolicy = DeletionPolicy.Retain
    override val dependsOn = Seq(dbServer)
  }
  val resources = Seq(
    appServer,
    dbServer
  )

  val appServerInstanceId = Output("AppServerInstanceId", appServer.ref)
  val appServerPublicIp = Output("AppServerPublicIp", appServer.attributes.publicIp,
    export = Export("PublicIp", appServer.attributes.publicIp))
  val outputs = Seq(
    appServerInstanceId,
    appServerPublicIp
  )
}