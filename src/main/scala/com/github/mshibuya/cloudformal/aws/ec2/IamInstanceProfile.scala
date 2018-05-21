package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html
 */

case class IamInstanceProfile(
    arn: Property[String] = Empty,
    name: Property[String] = Empty) extends Expression[IamInstanceProfile] {
  def render: Formattable = Value(
    "Arn" -> arn,
    "Name" -> name
  )
}
