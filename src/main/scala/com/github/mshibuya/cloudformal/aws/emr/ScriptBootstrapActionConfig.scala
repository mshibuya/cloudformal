package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html
 */

case class ScriptBootstrapActionConfig(
    args: Property[Seq[String]] = Empty,
    path: NonEmptyProperty[String]) extends Expression[ScriptBootstrapActionConfig] {
  def render: Formattable = Value(
    "Args" -> args,
    "Path" -> path
  )
}
