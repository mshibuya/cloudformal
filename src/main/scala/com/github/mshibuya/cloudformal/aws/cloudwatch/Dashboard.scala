package com.github.mshibuya.cloudformal.aws.cloudwatch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html
 */

trait Dashboard extends Resource {
  val resourceTypeName = "AWS::CloudWatch::Dashboard"

  def dashboardName: Option[String] = None
  def dashboardBody: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "DashboardName" -> dashboardName.map(Formattable(_)),
    "DashboardBody" -> Some(Formattable(dashboardBody))
  )
}
