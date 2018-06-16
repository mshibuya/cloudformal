package com.github.mshibuya.cloudformal.example

import com.amazonaws.services.ec2.model.{DescribeImagesRequest, Filter}
import com.amazonaws.services.ec2.{AmazonEC2, AmazonEC2ClientBuilder}
import com.github.mshibuya.cloudformal.aws.ec2
import com.github.mshibuya.cloudformal.model._

import scala.collection.JavaConverters._

object QueryingStack extends Stack {
  val name = "QueryingStack"
  val description = "A stack to demonstrate querying value dynamically using AWS Java SDK"

  val appServer = new ec2.Instance {
    val logicalId = "AppServer"
    val imageId = {
      val ec2: AmazonEC2 = {
        val builder = AmazonEC2ClientBuilder.standard().withCredentials(Main.config.credentialsProvider)
        builder.setRegion(Main.config.region)
        builder.build()
      }
      val request = new DescribeImagesRequest()
      request.setOwners(Seq("amazon").asJava)
      request.setFilters(Seq(
        new Filter("name", Seq("amzn-ami-hvm-*").asJava),
        new Filter("virtualization-type", Seq("hvm").asJava),
        new Filter("root-device-type", Seq("ebs").asJava)
      ).asJava)
      Value(ec2.describeImages(request).getImages.asScala.maxBy(_.getName).getImageId)
    }
    override val instanceType = Value("m4.large")
    override def subnetId: Property[String] = ApplicationStack.subnetId.importValue

  }

  val appServerInstanceId = Output("AppServerInstanceId", appServer.ref)

  val parameters: Seq[Parameter[_, _]] = Macros.parametersIn(this)
  val mappings: Seq[Mapping] = Macros.mappingsIn(this)
  val resources: Seq[Resource[_]] = Macros.resourcesIn(this)
  val outputs: Seq[Output[_]] = Macros.outputsIn(this)
}