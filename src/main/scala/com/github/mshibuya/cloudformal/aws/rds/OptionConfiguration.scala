package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html
 */

case class OptionConfiguration(
    dBSecurityGroupMemberships: Option[Seq[String]] = None,
    optionName: String,
    optionSettings: Option[OptionSetting] = None,
    optionVersion: Option[String] = None,
    port: Option[Int] = None,
    vpcSecurityGroupMemberships: Option[Seq[String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DBSecurityGroupMemberships" -> dBSecurityGroupMemberships.map(Formattable(_)),
    "OptionName" -> Some(Formattable(optionName)),
    "OptionSettings" -> optionSettings.map(Formattable(_)),
    "OptionVersion" -> optionVersion.map(Formattable(_)),
    "Port" -> port.map(Formattable(_)),
    "VpcSecurityGroupMemberships" -> vpcSecurityGroupMemberships.map(Formattable(_))
  )
}
