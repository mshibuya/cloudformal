package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html
 */

case class RoleMapping(
    `type`: String,
    ambiguousRoleResolution: Option[String] = None,
    rulesConfiguration: Option[RulesConfigurationType] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Type" -> Some(Formattable(`type`)),
    "AmbiguousRoleResolution" -> ambiguousRoleResolution.map(Formattable(_)),
    "RulesConfiguration" -> rulesConfiguration.map(Formattable(_))
  )
}
