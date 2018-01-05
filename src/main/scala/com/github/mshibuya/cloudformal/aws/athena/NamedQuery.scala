package com.github.mshibuya.cloudformal.aws.athena

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html
 */

trait NamedQuery extends Resource {
  val resourceTypeName = "AWS::Athena::NamedQuery"

  def description: Option[String] = None
  def queryString: String
  def database: String
  def name: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> description.map(Formattable(_)),
    "QueryString" -> Some(Formattable(queryString)),
    "Database" -> Some(Formattable(database)),
    "Name" -> name.map(Formattable(_))
  )
}
