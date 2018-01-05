package com.github.mshibuya.cloudformal.aws.config

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html
 */

case class SourceDetail(
    eventSource: String,
    maximumExecutionFrequency: Option[String] = None,
    messageType: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "EventSource" -> Some(Formattable(eventSource)),
    "MaximumExecutionFrequency" -> maximumExecutionFrequency.map(Formattable(_)),
    "MessageType" -> Some(Formattable(messageType))
  )
}
