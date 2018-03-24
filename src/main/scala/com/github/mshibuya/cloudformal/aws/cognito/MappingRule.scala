package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html
 */

case class MappingRule(
    matchType: NonEmptyProperty[String],
    value: NonEmptyProperty[String],
    claim: NonEmptyProperty[String],
    roleARN: NonEmptyProperty[String]) extends Expression[MappingRule] {
  def render: Formattable = Value(
    "MatchType" -> matchType,
    "Value" -> value,
    "Claim" -> claim,
    "RoleARN" -> roleARN
  )
}
