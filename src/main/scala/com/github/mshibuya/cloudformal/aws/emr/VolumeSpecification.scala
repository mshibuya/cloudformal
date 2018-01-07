package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification.html
 */

case class VolumeSpecification(
    iops: Property[Int] = Empty,
    sizeInGB: NonEmptyProperty[Int],
    volumeType: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Iops" -> iops,
    "SizeInGB" -> sizeInGB,
    "VolumeType" -> volumeType
  )
}
