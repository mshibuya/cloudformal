package com.github.mshibuya.cloudformal.generator

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

case object Generator {
  def generateResource(name: String, resource: ResourceSpecification): Unit = {
    val template = ResourceTemplate(name, resource)

    val targetPath = Paths.get("src", Seq("main", "scala") ++ template.packageName.split("\\."):_*)
    if(Files.notExists(targetPath)) Files.createDirectories(targetPath)

    val writer = new PrintWriter(targetPath.resolve(template.fileName).toFile)
    writer.write(template.render)
    writer.close()
  }

  def generateProperty(name: String, property: PropertySpecification): Unit = {
    val template = PropertyTemplate(name, property)

    val targetPath = Paths.get("src", Seq("main", "scala") ++ template.packageName.split("\\."):_*)
    if(Files.notExists(targetPath)) Files.createDirectories(targetPath)

    val writer = new PrintWriter(targetPath.resolve(template.fileName).toFile)
    writer.write(template.render)
    writer.close()
  }

  def generateAll(speficicationUrl: String): Unit = {
    val specification = Specification.decode(Source.fromURL(speficicationUrl)("UTF-8").mkString)
    specification.propertyTypes.foreach { case (name, property) => generateProperty(name, property)}
    specification.resourceTypes.foreach { case (name, resource) => generateResource(name, resource)}
  }

  def main(args: Array[String]): Unit = {
    generateAll("https://d1uauaxba7bl26.cloudfront.net/latest/CloudFormationResourceSpecification.json")
  }
}