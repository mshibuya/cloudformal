package com.github.mshibuya.cloudformal.aws.elasticsearch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html
 */

case class EBSOptions(
    eBSEnabled: Option[Boolean] = None,
    iops: Option[Int] = None,
    volumeSize: Option[Int] = None,
    volumeType: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "EBSEnabled" -> eBSEnabled.map(Formattable(_)),
    "Iops" -> iops.map(Formattable(_)),
    "VolumeSize" -> volumeSize.map(Formattable(_)),
    "VolumeType" -> volumeType.map(Formattable(_))
  )
}
