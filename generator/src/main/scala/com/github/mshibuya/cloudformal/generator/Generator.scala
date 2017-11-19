package com.github.mshibuya.cloudformal.generator

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import net.ruippeixotog.scalascraper.browser.JsoupBrowser
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.model.Document

case object Generator {
  def generate(uri: String): Unit = {
    val doc: Document = JsoupBrowser().get(uri)

    val resourceName: String = (doc >?> elements("h1").map(_.headOption.map(_.text))).flatten.get
    val properties = for {
      (title, description) <- (doc >> elements("div.variablelist > dl > dt")).zip(
        doc >> elements("div.variablelist > dl > dd")
      )
    } yield PropertyTemplate(title, description)

    val resource = ResourceTemplate(resourceName, properties.flatten.toSeq)

    val targetPath = Paths.get("src", (Seq("main", "scala") ++ resource.packageName.split("\\.")):_*)
    if(Files.notExists(targetPath)) Files.createDirectories(targetPath)

    val writer = new PrintWriter(targetPath.resolve(resource.fileName).toFile)
    writer.write(resource.render)
    writer.close()
  }

  def generateAll(): Unit = Seq(
    "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html",
    "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html",
    "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html"
  ).foreach(uri => generate(uri))

  def main(args: Array[String]): Unit = {
    generateAll()
  }
}