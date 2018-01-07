package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html
 */

case class RulesConfigurationType(
    rules: NonEmptyProperty[Seq[MappingRule]]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Rules" -> rules
  )
}
