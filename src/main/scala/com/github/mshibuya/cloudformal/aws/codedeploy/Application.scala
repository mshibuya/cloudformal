package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html
 */

trait Application extends Resource[Application] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::CodeDeploy::Application"

  def applicationName: Property[String] = Empty
  def computePlatform: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "ApplicationName" -> applicationName,
    "ComputePlatform" -> computePlatform
  )
}
