package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification.html
 */

case class VolumeSpecification(
    iops: Option[Int] = None,
    sizeInGB: Int,
    volumeType: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Iops" -> iops.map(Formattable(_)),
    "SizeInGB" -> Some(Formattable(sizeInGB)),
    "VolumeType" -> Some(Formattable(volumeType))
  )
}
