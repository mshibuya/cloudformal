package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html
 */

trait SpotFleet extends Resource {
  val resourceTypeName = "AWS::EC2::SpotFleet"

  def spotFleetRequestConfigData: SpotFleetRequestConfigData

  def resourceProperties: FormattableMap = Formattable.opt(
    "SpotFleetRequestConfigData" -> Some(Formattable(spotFleetRequestConfigData))
  )
}
