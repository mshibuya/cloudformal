package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html
 */

case class EbsConfiguration(
    ebsBlockDeviceConfigs: Option[Seq[EbsBlockDeviceConfig]] = None,
    ebsOptimized: Option[Boolean] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "EbsBlockDeviceConfigs" -> ebsBlockDeviceConfigs.map(Formattable(_)),
    "EbsOptimized" -> ebsOptimized.map(Formattable(_))
  )
}
