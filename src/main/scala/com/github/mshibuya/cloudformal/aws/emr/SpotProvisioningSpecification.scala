package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html
 */

case class SpotProvisioningSpecification(
    blockDurationMinutes: Option[Int] = None,
    timeoutAction: String,
    timeoutDurationMinutes: Int) extends Renderable {
  def render: Formattable = Formattable.opt(
    "BlockDurationMinutes" -> blockDurationMinutes.map(Formattable(_)),
    "TimeoutAction" -> Some(Formattable(timeoutAction)),
    "TimeoutDurationMinutes" -> Some(Formattable(timeoutDurationMinutes))
  )
}
