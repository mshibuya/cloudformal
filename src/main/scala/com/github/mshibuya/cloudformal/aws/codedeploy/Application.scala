package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html
 */

trait Application extends Resource {
  val resourceTypeName = "AWS::CodeDeploy::Application"

  def applicationName: Property[String] = Empty
  def computePlatform: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ApplicationName" -> applicationName,
    "ComputePlatform" -> computePlatform
  )
}
