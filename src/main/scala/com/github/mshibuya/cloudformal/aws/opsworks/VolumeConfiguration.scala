package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html
 */

case class VolumeConfiguration(
    iops: Option[Int] = None,
    mountPoint: Option[String] = None,
    numberOfDisks: Option[Int] = None,
    raidLevel: Option[Int] = None,
    size: Option[Int] = None,
    volumeType: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Iops" -> iops.map(Formattable(_)),
    "MountPoint" -> mountPoint.map(Formattable(_)),
    "NumberOfDisks" -> numberOfDisks.map(Formattable(_)),
    "RaidLevel" -> raidLevel.map(Formattable(_)),
    "Size" -> size.map(Formattable(_)),
    "VolumeType" -> volumeType.map(Formattable(_))
  )
}
