package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html
 */

trait App extends Resource {
  val resourceTypeName = "AWS::OpsWorks::App"

  def appSource: Option[Source] = None
  def attributes: Option[ListMap[String, String]] = None
  def dataSources: Option[Seq[DataSource]] = None
  def description: Option[String] = None
  def domains: Option[Seq[String]] = None
  def enableSsl: Option[Boolean] = None
  def environment: Option[Seq[EnvironmentVariable]] = None
  def name: String
  def shortname: Option[String] = None
  def sslConfiguration: Option[SslConfiguration] = None
  def stackId: String
  def `type`: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "AppSource" -> appSource.map(Formattable(_)),
    "Attributes" -> attributes.map(Formattable(_)),
    "DataSources" -> dataSources.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "Domains" -> domains.map(Formattable(_)),
    "EnableSsl" -> enableSsl.map(Formattable(_)),
    "Environment" -> environment.map(Formattable(_)),
    "Name" -> Some(Formattable(name)),
    "Shortname" -> shortname.map(Formattable(_)),
    "SslConfiguration" -> sslConfiguration.map(Formattable(_)),
    "StackId" -> Some(Formattable(stackId)),
    "Type" -> Some(Formattable(`type`))
  )
}
