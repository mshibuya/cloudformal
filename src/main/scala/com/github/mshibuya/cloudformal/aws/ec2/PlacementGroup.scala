package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html
 */

trait PlacementGroup extends Resource {
  val resourceTypeName = "AWS::EC2::PlacementGroup"

  def strategy: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Strategy" -> strategy.map(Formattable(_))
  )
}
