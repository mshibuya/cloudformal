package com.github.mshibuya.cloudformal.aws.elasticsearch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html
 */

case class EBSOptions(
    eBSEnabled: Property[Boolean] = Empty,
    iops: Property[Int] = Empty,
    volumeSize: Property[Int] = Empty,
    volumeType: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "EBSEnabled" -> eBSEnabled,
    "Iops" -> iops,
    "VolumeSize" -> volumeSize,
    "VolumeType" -> volumeType
  )
}
