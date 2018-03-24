package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html
 */

trait SpotFleet extends Resource[SpotFleet] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::SpotFleet"

  def spotFleetRequestConfigData: NonEmptyProperty[SpotFleetRequestConfigData]

  def render(): MapValue[_] = Value(
    "SpotFleetRequestConfigData" -> spotFleetRequestConfigData
  )
}
