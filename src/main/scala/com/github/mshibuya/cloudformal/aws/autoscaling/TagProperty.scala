package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html
 */

case class TagProperty(
    key: String,
    propagateAtLaunch: Boolean,
    value: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Key" -> Some(Formattable(key)),
    "PropagateAtLaunch" -> Some(Formattable(propagateAtLaunch)),
    "Value" -> Some(Formattable(value))
  )
}
