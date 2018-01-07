package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html
 */

trait Environment extends Resource {
  val resourceTypeName = "AWS::ElasticBeanstalk::Environment"

  def endpointURLAttribute: Expression[String] = Fn.GetAtt(logicalId, "EndpointURL")

  def applicationName: NonEmptyProperty[String]
  def cNAMEPrefix: Property[String] = Empty
  def description: Property[String] = Empty
  def environmentName: Property[String] = Empty
  def optionSettings: Property[Seq[OptionSetting]] = Empty
  def platformArn: Property[String] = Empty
  def solutionStackName: Property[String] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def templateName: Property[String] = Empty
  def tier: Property[Tier] = Empty
  def versionLabel: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ApplicationName" -> applicationName,
    "CNAMEPrefix" -> cNAMEPrefix,
    "Description" -> description,
    "EnvironmentName" -> environmentName,
    "OptionSettings" -> optionSettings,
    "PlatformArn" -> platformArn,
    "SolutionStackName" -> solutionStackName,
    "Tags" -> tags,
    "TemplateName" -> templateName,
    "Tier" -> tier,
    "VersionLabel" -> versionLabel
  )
}
