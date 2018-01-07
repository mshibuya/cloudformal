package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html
 */

case class DataSource(
    arn: Property[String] = Empty,
    databaseName: Property[String] = Empty,
    `type`: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Arn" -> arn,
    "DatabaseName" -> databaseName,
    "Type" -> `type`
  )
}
