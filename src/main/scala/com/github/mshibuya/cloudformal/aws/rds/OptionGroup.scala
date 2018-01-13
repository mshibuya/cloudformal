package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html
 */

trait OptionGroup extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::RDS::OptionGroup"

  def engineName: NonEmptyProperty[String]
  def majorEngineVersion: NonEmptyProperty[String]
  def optionConfigurations: NonEmptyProperty[Seq[OptionConfiguration]]
  def optionGroupDescription: NonEmptyProperty[String]
  def tags: Property[Seq[Tag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "EngineName" -> engineName,
    "MajorEngineVersion" -> majorEngineVersion,
    "OptionConfigurations" -> optionConfigurations,
    "OptionGroupDescription" -> optionGroupDescription,
    "Tags" -> tags
  )
}
