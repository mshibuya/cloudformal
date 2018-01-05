package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html
 */

case class AccelerateConfiguration(
    accelerationStatus: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AccelerationStatus" -> Some(Formattable(accelerationStatus))
  )
}
