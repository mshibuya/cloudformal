package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-iaminstanceprofile.html
 */

case class IamInstanceProfileSpecification(
    arn: Property[String] = Empty) extends Expression[IamInstanceProfileSpecification] {
  def render: Formattable = Value(
    "Arn" -> arn
  )
}
