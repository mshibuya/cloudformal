package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html
 */

case class BootstrapActionConfig(
    name: NonEmptyProperty[String],
    scriptBootstrapAction: NonEmptyProperty[ScriptBootstrapActionConfig]) extends Expression[BootstrapActionConfig] {
  def render: Formattable = Value(
    "Name" -> name,
    "ScriptBootstrapAction" -> scriptBootstrapAction
  )
}
