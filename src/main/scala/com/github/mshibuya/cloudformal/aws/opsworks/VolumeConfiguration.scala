package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html
 */

case class VolumeConfiguration(
    iops: Property[Int] = Empty,
    mountPoint: Property[String] = Empty,
    numberOfDisks: Property[Int] = Empty,
    raidLevel: Property[Int] = Empty,
    size: Property[Int] = Empty,
    volumeType: Property[String] = Empty) extends Expression[VolumeConfiguration] {
  def render: Formattable = Value(
    "Iops" -> iops,
    "MountPoint" -> mountPoint,
    "NumberOfDisks" -> numberOfDisks,
    "RaidLevel" -> raidLevel,
    "Size" -> size,
    "VolumeType" -> volumeType
  )
}
