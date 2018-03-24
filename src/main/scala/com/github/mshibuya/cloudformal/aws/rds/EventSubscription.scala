package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html
 */

trait EventSubscription extends Resource[EventSubscription] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::RDS::EventSubscription"

  def enabled: Property[Boolean] = Empty
  def eventCategories: Property[Seq[String]] = Empty
  def snsTopicArn: NonEmptyProperty[String]
  def sourceIds: Property[Seq[String]] = Empty
  def sourceType: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "Enabled" -> enabled,
    "EventCategories" -> eventCategories,
    "SnsTopicArn" -> snsTopicArn,
    "SourceIds" -> sourceIds,
    "SourceType" -> sourceType
  )
}
