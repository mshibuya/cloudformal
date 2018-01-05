package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html
 */

trait ConfigurationTemplate extends Resource {
  val resourceTypeName = "AWS::ElasticBeanstalk::ConfigurationTemplate"

  def applicationName: String
  def description: Option[String] = None
  def environmentId: Option[String] = None
  def optionSettings: Option[Seq[ConfigurationOptionSetting]] = None
  def platformArn: Option[String] = None
  def solutionStackName: Option[String] = None
  def sourceConfiguration: Option[SourceConfiguration] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "ApplicationName" -> Some(Formattable(applicationName)),
    "Description" -> description.map(Formattable(_)),
    "EnvironmentId" -> environmentId.map(Formattable(_)),
    "OptionSettings" -> optionSettings.map(Formattable(_)),
    "PlatformArn" -> platformArn.map(Formattable(_)),
    "SolutionStackName" -> solutionStackName.map(Formattable(_)),
    "SourceConfiguration" -> sourceConfiguration.map(Formattable(_))
  )
}
