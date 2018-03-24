package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html
 */

case class SpotProvisioningSpecification(
    blockDurationMinutes: Property[Int] = Empty,
    timeoutAction: NonEmptyProperty[String],
    timeoutDurationMinutes: NonEmptyProperty[Int]) extends Expression[SpotProvisioningSpecification] {
  def render: Formattable = Value(
    "BlockDurationMinutes" -> blockDurationMinutes,
    "TimeoutAction" -> timeoutAction,
    "TimeoutDurationMinutes" -> timeoutDurationMinutes
  )
}
