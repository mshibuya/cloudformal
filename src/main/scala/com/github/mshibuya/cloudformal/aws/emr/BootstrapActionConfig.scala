package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html
 */

case class BootstrapActionConfig(
    name: String,
    scriptBootstrapAction: ScriptBootstrapActionConfig) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Name" -> Some(Formattable(name)),
    "ScriptBootstrapAction" -> Some(Formattable(scriptBootstrapAction))
  )
}
