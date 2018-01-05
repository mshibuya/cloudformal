package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html
 */

case class DataSource(
    arn: Option[String] = None,
    databaseName: Option[String] = None,
    `type`: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Arn" -> arn.map(Formattable(_)),
    "DatabaseName" -> databaseName.map(Formattable(_)),
    "Type" -> `type`.map(Formattable(_))
  )
}
