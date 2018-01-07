package com.github.mshibuya.cloudformal.aws.directoryservice

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-simplead-vpcsettings.html
 */

case class VpcSettings(
    subnetIds: NonEmptyProperty[Seq[String]],
    vpcId: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "SubnetIds" -> subnetIds,
    "VpcId" -> vpcId
  )
}
