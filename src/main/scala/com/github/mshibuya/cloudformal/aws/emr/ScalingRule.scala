package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingrule.html
 */

case class ScalingRule(
    action: ScalingAction,
    description: Option[String] = None,
    name: String,
    trigger: ScalingTrigger) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Action" -> Some(Formattable(action)),
    "Description" -> description.map(Formattable(_)),
    "Name" -> Some(Formattable(name)),
    "Trigger" -> Some(Formattable(trigger))
  )
}
