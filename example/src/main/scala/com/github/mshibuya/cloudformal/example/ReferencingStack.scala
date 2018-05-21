package com.github.mshibuya.cloudformal.example

import com.github.mshibuya.cloudformal.aws.ec2
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy.{CreationPolicy, DeletionPolicy, ResourceSignal}

object ReferencingStack extends Stack {
  val name = "ReferencingStack"
  val description = "A stack to demonstrate cross stack reference"

  val parameters = Nil

  val regionMap = StringMapping("RegionMap", Map(
    "us-east-1" -> Map("64" -> "ami-97785bed"),
    "ap-northeast-1" -> Map("64" -> "ami-ceafcba8"),
  ))
  val mappings = Seq(
    regionMap
  )

  val appServer = new ec2.Instance {
    val logicalId = "AppServer"
    val imageId = regionMap.get(Value("ap-northeast-1"), Value("64"))
    override val instanceType = Value("m4.large")
    override def subnetId: Property[String] = ApplicationStack.subnetId.importValue

  }
  val resources = Seq(
    appServer
  )

  val appServerInstanceId = Output("AppServerInstanceId", appServer.ref)
  val outputs = Seq(
    appServerInstanceId
  )
}