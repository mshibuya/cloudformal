package com.github.mshibuya.cloudformal.aws.cloudformation

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html
 */

trait Stack extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::CloudFormation::Stack"

  def notificationARNs: Property[Seq[String]] = Empty
  def parameters: Property[ListMap[String, String]] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def templateURL: NonEmptyProperty[String]
  def timeoutInMinutes: Property[Int] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "NotificationARNs" -> notificationARNs,
    "Parameters" -> parameters,
    "Tags" -> tags,
    "TemplateURL" -> templateURL,
    "TimeoutInMinutes" -> timeoutInMinutes
  )
}
