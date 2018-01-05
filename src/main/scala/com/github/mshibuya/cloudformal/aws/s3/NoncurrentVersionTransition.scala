package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html
 */

case class NoncurrentVersionTransition(
    storageClass: String,
    transitionInDays: Int) extends Renderable {
  def render: Formattable = Formattable.opt(
    "StorageClass" -> Some(Formattable(storageClass)),
    "TransitionInDays" -> Some(Formattable(transitionInDays))
  )
}
