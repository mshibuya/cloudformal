package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html
 */

trait Crawler extends Resource[Crawler] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Glue::Crawler"

  def role: NonEmptyProperty[String]
  def classifiers: Property[Seq[String]] = Empty
  def description: Property[String] = Empty
  def schemaChangePolicy: Property[SchemaChangePolicy] = Empty
  def schedule: Property[Schedule] = Empty
  def databaseName: NonEmptyProperty[String]
  def targets: NonEmptyProperty[Targets]
  def tablePrefix: Property[String] = Empty
  def name: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "Role" -> role,
    "Classifiers" -> classifiers,
    "Description" -> description,
    "SchemaChangePolicy" -> schemaChangePolicy,
    "Schedule" -> schedule,
    "DatabaseName" -> databaseName,
    "Targets" -> targets,
    "TablePrefix" -> tablePrefix,
    "Name" -> name
  )
}
