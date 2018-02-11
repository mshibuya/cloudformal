package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html
 */

case class OptionConfiguration(
    dbSecurityGroupMemberships: Property[Seq[String]] = Empty,
    optionName: NonEmptyProperty[String],
    optionSettings: Property[OptionSetting] = Empty,
    optionVersion: Property[String] = Empty,
    port: Property[Int] = Empty,
    vpcSecurityGroupMemberships: Property[Seq[String]] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "DBSecurityGroupMemberships" -> dbSecurityGroupMemberships,
    "OptionName" -> optionName,
    "OptionSettings" -> optionSettings,
    "OptionVersion" -> optionVersion,
    "Port" -> port,
    "VpcSecurityGroupMemberships" -> vpcSecurityGroupMemberships
  )
}
