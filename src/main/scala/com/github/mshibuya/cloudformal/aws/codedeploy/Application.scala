package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html
 */

trait Application extends Resource {
  val resourceTypeName = "AWS::CodeDeploy::Application"

  def applicationName: Option[String] = None
  def computePlatform: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "ApplicationName" -> applicationName.map(Formattable(_)),
    "ComputePlatform" -> computePlatform.map(Formattable(_))
  )
}
