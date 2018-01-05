package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html
 */

case class MappingRule(
    matchType: String,
    value: String,
    claim: String,
    roleARN: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "MatchType" -> Some(Formattable(matchType)),
    "Value" -> Some(Formattable(value)),
    "Claim" -> Some(Formattable(claim)),
    "RoleARN" -> Some(Formattable(roleARN))
  )
}
