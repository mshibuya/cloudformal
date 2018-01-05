package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-securitygroups.html
 */

case class GroupIdentifier(
    groupId: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "GroupId" -> Some(Formattable(groupId))
  )
}
