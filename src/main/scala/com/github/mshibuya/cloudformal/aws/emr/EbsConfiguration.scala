package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html
 */

case class EbsConfiguration(
    ebsBlockDeviceConfigs: Property[Seq[EbsBlockDeviceConfig]] = Empty,
    ebsOptimized: Property[Boolean] = Empty) extends Expression[EbsConfiguration] {
  def render: Formattable = Value(
    "EbsBlockDeviceConfigs" -> ebsBlockDeviceConfigs,
    "EbsOptimized" -> ebsOptimized
  )
}
