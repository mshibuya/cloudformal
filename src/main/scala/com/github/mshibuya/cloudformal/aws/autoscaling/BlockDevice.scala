package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html
 */

case class BlockDevice(
    deleteOnTermination: Option[Boolean] = None,
    encrypted: Option[Boolean] = None,
    iops: Option[Int] = None,
    snapshotId: Option[String] = None,
    volumeSize: Option[Int] = None,
    volumeType: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DeleteOnTermination" -> deleteOnTermination.map(Formattable(_)),
    "Encrypted" -> encrypted.map(Formattable(_)),
    "Iops" -> iops.map(Formattable(_)),
    "SnapshotId" -> snapshotId.map(Formattable(_)),
    "VolumeSize" -> volumeSize.map(Formattable(_)),
    "VolumeType" -> volumeType.map(Formattable(_))
  )
}
