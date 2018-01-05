package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-iaminstanceprofile.html
 */

case class IamInstanceProfileSpecification(
    arn: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Arn" -> arn.map(Formattable(_))
  )
}
