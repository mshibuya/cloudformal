package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html
 */

trait ConfigurationTemplate extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ElasticBeanstalk::ConfigurationTemplate"

  def applicationName: NonEmptyProperty[String]
  def description: Property[String] = Empty
  def environmentId: Property[String] = Empty
  def optionSettings: Property[Seq[ConfigurationOptionSetting]] = Empty
  def platformArn: Property[String] = Empty
  def solutionStackName: Property[String] = Empty
  def sourceConfiguration: Property[SourceConfiguration] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ApplicationName" -> applicationName,
    "Description" -> description,
    "EnvironmentId" -> environmentId,
    "OptionSettings" -> optionSettings,
    "PlatformArn" -> platformArn,
    "SolutionStackName" -> solutionStackName,
    "SourceConfiguration" -> sourceConfiguration
  )
}
