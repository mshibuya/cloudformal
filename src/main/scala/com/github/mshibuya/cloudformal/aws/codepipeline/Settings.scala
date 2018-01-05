package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html
 */

case class Settings(
    entityUrlTemplate: Option[String] = None,
    executionUrlTemplate: Option[String] = None,
    revisionUrlTemplate: Option[String] = None,
    thirdPartyConfigurationUrl: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "EntityUrlTemplate" -> entityUrlTemplate.map(Formattable(_)),
    "ExecutionUrlTemplate" -> executionUrlTemplate.map(Formattable(_)),
    "RevisionUrlTemplate" -> revisionUrlTemplate.map(Formattable(_)),
    "ThirdPartyConfigurationUrl" -> thirdPartyConfigurationUrl.map(Formattable(_))
  )
}
