package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html
 */

case class RoleMapping(
    `type`: NonEmptyProperty[String],
    ambiguousRoleResolution: Property[String] = Empty,
    rulesConfiguration: Property[RulesConfigurationType] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Type" -> `type`,
    "AmbiguousRoleResolution" -> ambiguousRoleResolution,
    "RulesConfiguration" -> rulesConfiguration
  )
}
