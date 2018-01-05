package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig.html
 */

case class EbsBlockDeviceConfig(
    volumeSpecification: VolumeSpecification,
    volumesPerInstance: Option[Int] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "VolumeSpecification" -> Some(Formattable(volumeSpecification)),
    "VolumesPerInstance" -> volumesPerInstance.map(Formattable(_))
  )
}
