package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html
 */

trait OptionGroup extends Resource {
  val resourceTypeName = "AWS::RDS::OptionGroup"

  def engineName: String
  def majorEngineVersion: String
  def optionConfigurations: Seq[OptionConfiguration]
  def optionGroupDescription: String
  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "EngineName" -> Some(Formattable(engineName)),
    "MajorEngineVersion" -> Some(Formattable(majorEngineVersion)),
    "OptionConfigurations" -> Some(Formattable(optionConfigurations)),
    "OptionGroupDescription" -> Some(Formattable(optionGroupDescription)),
    "Tags" -> tags.map(Formattable(_))
  )
}
