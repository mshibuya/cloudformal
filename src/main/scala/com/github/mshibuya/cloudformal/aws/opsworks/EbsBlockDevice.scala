package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html
 */

case class EbsBlockDevice(
    deleteOnTermination: Property[Boolean] = Empty,
    iops: Property[Int] = Empty,
    snapshotId: Property[String] = Empty,
    volumeSize: Property[Int] = Empty,
    volumeType: Property[String] = Empty) extends Expression[EbsBlockDevice] {
  def render: Formattable = Value(
    "DeleteOnTermination" -> deleteOnTermination,
    "Iops" -> iops,
    "SnapshotId" -> snapshotId,
    "VolumeSize" -> volumeSize,
    "VolumeType" -> volumeType
  )
}
