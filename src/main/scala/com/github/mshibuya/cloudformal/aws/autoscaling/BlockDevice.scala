package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html
 */

case class BlockDevice(
    deleteOnTermination: Property[Boolean] = Empty,
    encrypted: Property[Boolean] = Empty,
    iops: Property[Int] = Empty,
    snapshotId: Property[String] = Empty,
    volumeSize: Property[Int] = Empty,
    volumeType: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "DeleteOnTermination" -> deleteOnTermination,
    "Encrypted" -> encrypted,
    "Iops" -> iops,
    "SnapshotId" -> snapshotId,
    "VolumeSize" -> volumeSize,
    "VolumeType" -> volumeType
  )
}
