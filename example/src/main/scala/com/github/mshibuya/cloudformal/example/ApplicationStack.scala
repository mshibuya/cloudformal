package com.github.mshibuya.cloudformal.example

import com.github.mshibuya.cloudformal.aws.ec2
import com.github.mshibuya.cloudformal.model._

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

  val appServer = new ec2.Instance {
    val logicalId = "AppServer"
    val imageId = Fn.FindInMap(regionMap, Value("us-east-1"), Value("32"))
    override val instanceType = appServerInstanceType.ref
  }
  val resources = Seq(
    appServer
  )

  val appServerInstanceId = Output("AppServerInstanceId", appServer.ref)
  val appServerPublicIp = Output("AppServerPublicIp", appServer.publicIpAttribute)
  val outputs = Seq(
    appServerInstanceId,
    appServerPublicIp
  )
}