package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html
 */

trait PlacementGroup extends Resource {
  val resourceTypeName = "AWS::EC2::PlacementGroup"

  def strategy: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Strategy" -> strategy
  )
}
