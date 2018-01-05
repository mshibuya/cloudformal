package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html
 */

case class Transition(
    storageClass: String,
    transitionDate: Option[java.time.ZonedDateTime] = None,
    transitionInDays: Option[Int] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "StorageClass" -> Some(Formattable(storageClass)),
    "TransitionDate" -> transitionDate.map(Formattable(_)),
    "TransitionInDays" -> transitionInDays.map(Formattable(_))
  )
}
