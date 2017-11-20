package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html
 */

case class EC2EBSBlockDevice(
    deleteOnTermination: Option[Boolean] = None,
    encrypted: Option[Boolean] = None,
    iops: Option[Int] = None,
    snapshotId: Option[String] = None,
    volumeSize: Option[String] = None,
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
