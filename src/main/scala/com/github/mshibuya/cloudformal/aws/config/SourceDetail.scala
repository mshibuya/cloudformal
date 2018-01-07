package com.github.mshibuya.cloudformal.aws.config

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html
 */

case class SourceDetail(
    eventSource: NonEmptyProperty[String],
    maximumExecutionFrequency: Property[String] = Empty,
    messageType: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "EventSource" -> eventSource,
    "MaximumExecutionFrequency" -> maximumExecutionFrequency,
    "MessageType" -> messageType
  )
}
