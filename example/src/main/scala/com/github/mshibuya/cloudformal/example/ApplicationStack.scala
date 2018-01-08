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

  val appServer = new ec2.Instance {
    val logicalId = "AppServer"
    val imageId = Value("ami-111111")
    override val instanceType = appServerInstanceType.ref
  }

  val resources = Seq(
    appServer
  )
}