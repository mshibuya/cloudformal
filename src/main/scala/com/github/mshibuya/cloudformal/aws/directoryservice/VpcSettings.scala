package com.github.mshibuya.cloudformal.aws.directoryservice

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-simplead-vpcsettings.html
 */

case class VpcSettings(
    subnetIds: Seq[String],
    vpcId: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "SubnetIds" -> Some(Formattable(subnetIds)),
    "VpcId" -> Some(Formattable(vpcId))
  )
}
