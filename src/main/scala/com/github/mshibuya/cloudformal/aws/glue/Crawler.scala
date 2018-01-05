package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html
 */

trait Crawler extends Resource {
  val resourceTypeName = "AWS::Glue::Crawler"

  def role: String
  def classifiers: Option[Seq[String]] = None
  def description: Option[String] = None
  def schemaChangePolicy: Option[SchemaChangePolicy] = None
  def schedule: Option[Schedule] = None
  def databaseName: String
  def targets: Targets
  def tablePrefix: Option[String] = None
  def name: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Role" -> Some(Formattable(role)),
    "Classifiers" -> classifiers.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "SchemaChangePolicy" -> schemaChangePolicy.map(Formattable(_)),
    "Schedule" -> schedule.map(Formattable(_)),
    "DatabaseName" -> Some(Formattable(databaseName)),
    "Targets" -> Some(Formattable(targets)),
    "TablePrefix" -> tablePrefix.map(Formattable(_)),
    "Name" -> name.map(Formattable(_))
  )
}
