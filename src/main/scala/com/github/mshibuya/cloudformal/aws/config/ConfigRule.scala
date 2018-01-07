package com.github.mshibuya.cloudformal.aws.config

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html
 */

trait ConfigRule extends Resource {
  val resourceTypeName = "AWS::Config::ConfigRule"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  def complianceTypeAttribute: Expression[String] = Fn.GetAtt(logicalId, "Compliance.Type")
  def configRuleIdAttribute: Expression[String] = Fn.GetAtt(logicalId, "ConfigRuleId")

  def configRuleName: Property[String] = Empty
  def description: Property[String] = Empty
  def inputParameters: Property[Json] = Empty
  def maximumExecutionFrequency: Property[String] = Empty
  def scope: Property[Scope] = Empty
  def source: NonEmptyProperty[Source]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ConfigRuleName" -> configRuleName,
    "Description" -> description,
    "InputParameters" -> inputParameters,
    "MaximumExecutionFrequency" -> maximumExecutionFrequency,
    "Scope" -> scope,
    "Source" -> source
  )
}
