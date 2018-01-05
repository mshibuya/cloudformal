package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html
 */

case class ConfigurationOptionSetting(
    namespace: String,
    optionName: String,
    resourceName: Option[String] = None,
    value: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Namespace" -> Some(Formattable(namespace)),
    "OptionName" -> Some(Formattable(optionName)),
    "ResourceName" -> resourceName.map(Formattable(_)),
    "Value" -> value.map(Formattable(_))
  )
}
