package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html
 */

trait App extends Resource {
  val resourceTypeName = "AWS::OpsWorks::App"

  def appSource: Property[Source] = Empty
  def attributes: Property[ListMap[String, String]] = Empty
  def dataSources: Property[Seq[DataSource]] = Empty
  def description: Property[String] = Empty
  def domains: Property[Seq[String]] = Empty
  def enableSsl: Property[Boolean] = Empty
  def environment: Property[Seq[EnvironmentVariable]] = Empty
  def name: NonEmptyProperty[String]
  def shortname: Property[String] = Empty
  def sslConfiguration: Property[SslConfiguration] = Empty
  def stackId: NonEmptyProperty[String]
  def `type`: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AppSource" -> appSource,
    "Attributes" -> attributes,
    "DataSources" -> dataSources,
    "Description" -> description,
    "Domains" -> domains,
    "EnableSsl" -> enableSsl,
    "Environment" -> environment,
    "Name" -> name,
    "Shortname" -> shortname,
    "SslConfiguration" -> sslConfiguration,
    "StackId" -> stackId,
    "Type" -> `type`
  )
}
