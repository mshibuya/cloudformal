package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html
 */

case class Transition(
    storageClass: NonEmptyProperty[String],
    transitionDate: Property[java.time.ZonedDateTime] = Empty,
    transitionInDays: Property[Int] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "StorageClass" -> storageClass,
    "TransitionDate" -> transitionDate,
    "TransitionInDays" -> transitionInDays
  )
}
