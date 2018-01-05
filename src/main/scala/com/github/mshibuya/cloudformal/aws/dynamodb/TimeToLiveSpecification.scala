package com.github.mshibuya.cloudformal.aws.dynamodb

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html
 */

case class TimeToLiveSpecification(
    attributeName: String,
    enabled: Boolean) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AttributeName" -> Some(Formattable(attributeName)),
    "Enabled" -> Some(Formattable(enabled))
  )
}
