package com.github.mshibuya.cloudformal.aws.athena

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html
 */

trait NamedQuery extends Resource {
  val resourceTypeName = "AWS::Athena::NamedQuery"

  def description: Property[String] = Empty
  def queryString: NonEmptyProperty[String]
  def database: NonEmptyProperty[String]
  def name: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Description" -> description,
    "QueryString" -> queryString,
    "Database" -> database,
    "Name" -> name
  )
}
