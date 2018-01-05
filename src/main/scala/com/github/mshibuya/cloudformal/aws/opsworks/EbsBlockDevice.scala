package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html
 */

case class EbsBlockDevice(
    deleteOnTermination: Option[Boolean] = None,
    iops: Option[Int] = None,
    snapshotId: Option[String] = None,
    volumeSize: Option[Int] = None,
    volumeType: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DeleteOnTermination" -> deleteOnTermination.map(Formattable(_)),
    "Iops" -> iops.map(Formattable(_)),
    "SnapshotId" -> snapshotId.map(Formattable(_)),
    "VolumeSize" -> volumeSize.map(Formattable(_)),
    "VolumeType" -> volumeType.map(Formattable(_))
  )
}
