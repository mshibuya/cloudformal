package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html
 */

case class ScriptBootstrapActionConfig(
    args: Option[Seq[String]] = None,
    path: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Args" -> args.map(Formattable(_)),
    "Path" -> Some(Formattable(path))
  )
}
