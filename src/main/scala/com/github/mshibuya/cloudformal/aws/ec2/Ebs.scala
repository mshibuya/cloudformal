package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html
 */

case class Ebs(
    snapshotId: Property[String] = Empty,
    volumeType: Property[String] = Empty,
    kmsKeyId: Property[String] = Empty,
    encrypted: Property[Boolean] = Empty,
    iops: Property[Int] = Empty,
    volumeSize: Property[Int] = Empty,
    deleteOnTermination: Property[Boolean] = Empty) extends Expression[Ebs] {
  def render: Formattable = Value(
    "SnapshotId" -> snapshotId,
    "VolumeType" -> volumeType,
    "KmsKeyId" -> kmsKeyId,
    "Encrypted" -> encrypted,
    "Iops" -> iops,
    "VolumeSize" -> volumeSize,
    "DeleteOnTermination" -> deleteOnTermination
  )
}
