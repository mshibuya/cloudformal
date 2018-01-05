package com.github.mshibuya.cloudformal.aws.dms

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html
 */

trait EventSubscription extends Resource {
  val resourceTypeName = "AWS::DMS::EventSubscription"

  def sourceType: Option[String] = None
  def eventCategories: Option[Seq[String]] = None
  def enabled: Option[Boolean] = None
  def subscriptionName: Option[String] = None
  def snsTopicArn: String
  def sourceIds: Option[Seq[String]] = None
  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "SourceType" -> sourceType.map(Formattable(_)),
    "EventCategories" -> eventCategories.map(Formattable(_)),
    "Enabled" -> enabled.map(Formattable(_)),
    "SubscriptionName" -> subscriptionName.map(Formattable(_)),
    "SnsTopicArn" -> Some(Formattable(snsTopicArn)),
    "SourceIds" -> sourceIds.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_))
  )
}
