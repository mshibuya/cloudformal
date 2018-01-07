package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html
 */

case class Settings(
    entityUrlTemplate: Property[String] = Empty,
    executionUrlTemplate: Property[String] = Empty,
    revisionUrlTemplate: Property[String] = Empty,
    thirdPartyConfigurationUrl: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "EntityUrlTemplate" -> entityUrlTemplate,
    "ExecutionUrlTemplate" -> executionUrlTemplate,
    "RevisionUrlTemplate" -> revisionUrlTemplate,
    "ThirdPartyConfigurationUrl" -> thirdPartyConfigurationUrl
  )
}
