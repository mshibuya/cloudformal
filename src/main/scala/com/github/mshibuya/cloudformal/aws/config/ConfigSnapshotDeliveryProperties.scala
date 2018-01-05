package com.github.mshibuya.cloudformal.aws.config

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-deliverychannel-configsnapshotdeliveryproperties.html
 */

case class ConfigSnapshotDeliveryProperties(
    deliveryFrequency: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DeliveryFrequency" -> deliveryFrequency.map(Formattable(_))
  )
}
