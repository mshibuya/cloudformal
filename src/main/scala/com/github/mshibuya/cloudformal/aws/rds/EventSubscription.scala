package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html
 */

trait EventSubscription extends Resource {
  val resourceTypeName = "AWS::RDS::EventSubscription"

  def enabled: Property[Boolean] = Empty
  def eventCategories: Property[Seq[String]] = Empty
  def snsTopicArn: NonEmptyProperty[String]
  def sourceIds: Property[Seq[String]] = Empty
  def sourceType: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Enabled" -> enabled,
    "EventCategories" -> eventCategories,
    "SnsTopicArn" -> snsTopicArn,
    "SourceIds" -> sourceIds,
    "SourceType" -> sourceType
  )
}
