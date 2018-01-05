package com.github.mshibuya.cloudformal.aws.cloudformation

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html
 */

trait Stack extends Resource {
  val resourceTypeName = "AWS::CloudFormation::Stack"

  def notificationARNs: Option[Seq[String]] = None
  def parameters: Option[ListMap[String, String]] = None
  def tags: Option[Seq[Tag]] = None
  def templateURL: String
  def timeoutInMinutes: Option[Int] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "NotificationARNs" -> notificationARNs.map(Formattable(_)),
    "Parameters" -> parameters.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "TemplateURL" -> Some(Formattable(templateURL)),
    "TimeoutInMinutes" -> timeoutInMinutes.map(Formattable(_))
  )
}
