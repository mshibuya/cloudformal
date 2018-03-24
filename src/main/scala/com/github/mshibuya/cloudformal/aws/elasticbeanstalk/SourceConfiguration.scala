package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html
 */

case class SourceConfiguration(
    applicationName: NonEmptyProperty[String],
    templateName: NonEmptyProperty[String]) extends Expression[SourceConfiguration] {
  def render: Formattable = Value(
    "ApplicationName" -> applicationName,
    "TemplateName" -> templateName
  )
}
