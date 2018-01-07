package com.github.mshibuya.cloudformal.example

import com.github.mshibuya.cloudformal.aws.ec2
import com.github.mshibuya.cloudformal.model._

object ApplicationStack extends Stack {
  val name = "ApplicationStack"
  val description = "My stack"

  val appServer = new ec2.Instance {
    val logicalId = "AppServer"
    val imageId = Value("ami-111111")
  }

  val resources = Seq(
    appServer
  )
}