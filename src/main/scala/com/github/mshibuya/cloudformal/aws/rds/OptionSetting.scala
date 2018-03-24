package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations-optionsettings.html
 */

case class OptionSetting(
    name: Property[String] = Empty,
    value: Property[String] = Empty) extends Expression[OptionSetting] {
  def render: Formattable = Value(
    "Name" -> name,
    "Value" -> value
  )
}
