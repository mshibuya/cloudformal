package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html
 */

trait Volume extends Resource {
  val resourceTypeName = "AWS::EC2::Volume"

  def autoEnableIO: Option[Boolean] = None
  def availabilityZone: String
  def encrypted: Option[Boolean] = None
  def iops: Option[Int] = None
  def kmsKeyId: Option[String] = None
  def size: Option[Int] = None
  def snapshotId: Option[String] = None
  def tags: Option[Seq[Tag]] = None
  def volumeType: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AutoEnableIO" -> autoEnableIO.map(Formattable(_)),
    "AvailabilityZone" -> Some(Formattable(availabilityZone)),
    "Encrypted" -> encrypted.map(Formattable(_)),
    "Iops" -> iops.map(Formattable(_)),
    "KmsKeyId" -> kmsKeyId.map(Formattable(_)),
    "Size" -> size.map(Formattable(_)),
    "SnapshotId" -> snapshotId.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "VolumeType" -> volumeType.map(Formattable(_))
  )
}
