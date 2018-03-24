package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html
 */

case class Ebs(
    deleteOnTermination: Property[Boolean] = Empty,
    encrypted: Property[Boolean] = Empty,
    iops: Property[Int] = Empty,
    snapshotId: Property[String] = Empty,
    volumeSize: Property[Int] = Empty,
    volumeType: Property[String] = Empty) extends Expression[Ebs] {
  def render: Formattable = Value(
    "DeleteOnTermination" -> deleteOnTermination,
    "Encrypted" -> encrypted,
    "Iops" -> iops,
    "SnapshotId" -> snapshotId,
    "VolumeSize" -> volumeSize,
    "VolumeType" -> volumeType
  )
}
