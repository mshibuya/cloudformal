package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html
 */

case class EbsConfiguration(
    ebsBlockDeviceConfigs: Property[Seq[EbsBlockDeviceConfig]] = Empty,
    ebsOptimized: Property[Boolean] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "EbsBlockDeviceConfigs" -> ebsBlockDeviceConfigs,
    "EbsOptimized" -> ebsOptimized
  )
}
