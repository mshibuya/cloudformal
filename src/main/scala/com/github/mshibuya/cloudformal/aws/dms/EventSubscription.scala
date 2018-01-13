package com.github.mshibuya.cloudformal.aws.dms

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html
 */

trait EventSubscription extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::DMS::EventSubscription"

  def sourceType: Property[String] = Empty
  def eventCategories: Property[Seq[String]] = Empty
  def enabled: Property[Boolean] = Empty
  def subscriptionName: Property[String] = Empty
  def snsTopicArn: NonEmptyProperty[String]
  def sourceIds: Property[Seq[String]] = Empty
  def tags: Property[Seq[Tag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "SourceType" -> sourceType,
    "EventCategories" -> eventCategories,
    "Enabled" -> enabled,
    "SubscriptionName" -> subscriptionName,
    "SnsTopicArn" -> snsTopicArn,
    "SourceIds" -> sourceIds,
    "Tags" -> tags
  )
}
