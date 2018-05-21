package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html
 */

trait LaunchTemplate extends Resource[LaunchTemplate] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::LaunchTemplate"

  object attributes {
    val latestVersionNumber: Expression[String] = Fn.GetAtt(logicalId, "LatestVersionNumber")
    val defaultVersionNumber: Expression[String] = Fn.GetAtt(logicalId, "DefaultVersionNumber")
  }

  def launchTemplateName: Property[String] = Empty
  def launchTemplateData: Property[LaunchTemplateData] = Empty

  def render(): MapValue[_] = Value(
    "LaunchTemplateName" -> launchTemplateName,
    "LaunchTemplateData" -> launchTemplateData
  )
}
