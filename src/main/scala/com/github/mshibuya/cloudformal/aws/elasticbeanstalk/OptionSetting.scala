package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html
 */

case class OptionSetting(
    namespace: NonEmptyProperty[String],
    optionName: NonEmptyProperty[String],
    resourceName: Property[String] = Empty,
    value: Property[String] = Empty) extends Expression[OptionSetting] {
  def render: Formattable = Value(
    "Namespace" -> namespace,
    "OptionName" -> optionName,
    "ResourceName" -> resourceName,
    "Value" -> value
  )
}
