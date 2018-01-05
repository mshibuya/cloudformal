package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-internetgateway.html
 */

trait InternetGateway extends Resource {
  val resourceTypeName = "AWS::EC2::InternetGateway"

  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Tags" -> tags.map(Formattable(_))
  )
}
