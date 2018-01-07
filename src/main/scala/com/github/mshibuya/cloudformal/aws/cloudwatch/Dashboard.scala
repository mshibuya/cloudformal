package com.github.mshibuya.cloudformal.aws.cloudwatch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html
 */

trait Dashboard extends Resource {
  val resourceTypeName = "AWS::CloudWatch::Dashboard"

  def dashboardName: Property[String] = Empty
  def dashboardBody: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "DashboardName" -> dashboardName,
    "DashboardBody" -> dashboardBody
  )
}
