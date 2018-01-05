package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html
 */

trait Environment extends Resource {
  val resourceTypeName = "AWS::ElasticBeanstalk::Environment"

  def applicationName: String
  def cNAMEPrefix: Option[String] = None
  def description: Option[String] = None
  def environmentName: Option[String] = None
  def optionSettings: Option[Seq[OptionSetting]] = None
  def platformArn: Option[String] = None
  def solutionStackName: Option[String] = None
  def tags: Option[Seq[Tag]] = None
  def templateName: Option[String] = None
  def tier: Option[Tier] = None
  def versionLabel: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "ApplicationName" -> Some(Formattable(applicationName)),
    "CNAMEPrefix" -> cNAMEPrefix.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "EnvironmentName" -> environmentName.map(Formattable(_)),
    "OptionSettings" -> optionSettings.map(Formattable(_)),
    "PlatformArn" -> platformArn.map(Formattable(_)),
    "SolutionStackName" -> solutionStackName.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "TemplateName" -> templateName.map(Formattable(_)),
    "Tier" -> tier.map(Formattable(_)),
    "VersionLabel" -> versionLabel.map(Formattable(_))
  )
}
