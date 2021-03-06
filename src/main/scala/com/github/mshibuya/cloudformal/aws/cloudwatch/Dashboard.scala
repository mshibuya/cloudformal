package com.github.mshibuya.cloudformal.aws.cloudwatch

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html
 */

trait Dashboard extends Resource[Dashboard] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::CloudWatch::Dashboard"

  def dashboardName: Property[String] = Empty
  def dashboardBody: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "DashboardName" -> dashboardName,
    "DashboardBody" -> dashboardBody
  )
}
