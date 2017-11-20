package com.github.mshibuya.cloudformal.generator

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import net.ruippeixotog.scalascraper.browser.JsoupBrowser
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.model.Document

case object Generator {
  val resources = Seq(
    "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html",
    "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html",
    "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html",
    "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html"
  )

  val properties = Map(
    "aws.ec2.EC2BlockDeviceMapping" -> "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html",
    "aws.ec2.EC2EBSBlockDevice" -> "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html",
    "aws.ec2.EC2NetworkInterfaceIpv6Addresses" -> "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-ipv6addresses.html",
    "aws.ec2.EC2NetworkInterface" -> "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html",
    "aws.ec2.PrivateIpAddressSpecification" -> "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html",
    "aws.ec2.EC2InstanceSsmAssociations" -> "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html",
    "aws.ec2.EC2InstanceSsmAssociationsAssociationParameters" -> "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations-associationparameters.html",
    "aws.ec2.EC2MountPoint" -> "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html",
    "aws.ec2.EC2SecurityGroupRule" -> "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html"
  )

  def generateResource(uri: String): Unit = {
    val doc: Document = JsoupBrowser().get(uri)

    val resourceName: String = (doc >?> elements("h1").map(_.headOption.map(_.text))).flatten.get
    val resource = ResourceTemplate(uri, resourceName, EntryTemplate.parse(doc))

    val targetPath = Paths.get("src", (Seq("main", "scala") ++ resource.packageName.split("\\.")):_*)
    if(Files.notExists(targetPath)) Files.createDirectories(targetPath)

    val writer = new PrintWriter(targetPath.resolve(resource.fileName).toFile)
    writer.write(resource.render)
    writer.close()
  }

  def generateProperty(name: String, uri: String): Unit = {
    val doc: Document = JsoupBrowser().get(uri)

    val property = PropertyTemplate(uri, name, EntryTemplate.parse(doc))

    val targetPath = Paths.get("src", (Seq("main", "scala") ++ property.packageName.split("\\.")):_*)
    if(Files.notExists(targetPath)) Files.createDirectories(targetPath)

    val writer = new PrintWriter(targetPath.resolve(property.fileName).toFile)
    writer.write(property.render)
    writer.close()
  }

  def generateAll(): Unit = {
    resources.foreach(generateResource)
    properties.foreach { case (name, uri) => generateProperty(name, uri) }
  }

  def main(args: Array[String]): Unit = {
    generateAll()
  }
}