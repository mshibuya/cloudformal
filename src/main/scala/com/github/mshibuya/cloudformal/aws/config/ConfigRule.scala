package com.github.mshibuya.cloudformal.aws.config

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html
 */

trait ConfigRule extends Resource {
  val resourceTypeName = "AWS::Config::ConfigRule"

  def configRuleName: Option[String] = None
  def description: Option[String] = None
  def inputParameters: Option[Json] = None
  def maximumExecutionFrequency: Option[String] = None
  def scope: Option[Scope] = None
  def source: Source

  def resourceProperties: FormattableMap = Formattable.opt(
    "ConfigRuleName" -> configRuleName.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "InputParameters" -> inputParameters.map(Formattable(_)),
    "MaximumExecutionFrequency" -> maximumExecutionFrequency.map(Formattable(_)),
    "Scope" -> scope.map(Formattable(_)),
    "Source" -> Some(Formattable(source))
  )
}
