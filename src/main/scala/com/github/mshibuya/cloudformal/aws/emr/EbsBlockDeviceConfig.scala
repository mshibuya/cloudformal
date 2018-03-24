package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig.html
 */

case class EbsBlockDeviceConfig(
    volumeSpecification: NonEmptyProperty[VolumeSpecification],
    volumesPerInstance: Property[Int] = Empty) extends Expression[EbsBlockDeviceConfig] {
  def render: Formattable = Value(
    "VolumeSpecification" -> volumeSpecification,
    "VolumesPerInstance" -> volumesPerInstance
  )
}
