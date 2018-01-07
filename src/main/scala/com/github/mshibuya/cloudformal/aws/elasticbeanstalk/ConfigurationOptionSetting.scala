package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html
 */

case class ConfigurationOptionSetting(
    namespace: NonEmptyProperty[String],
    optionName: NonEmptyProperty[String],
    resourceName: Property[String] = Empty,
    value: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Namespace" -> namespace,
    "OptionName" -> optionName,
    "ResourceName" -> resourceName,
    "Value" -> value
  )
}
