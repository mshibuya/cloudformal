package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html
 */

trait EventSubscription extends Resource {
  val resourceTypeName = "AWS::RDS::EventSubscription"

  def enabled: Option[Boolean] = None
  def eventCategories: Option[Seq[String]] = None
  def snsTopicArn: String
  def sourceIds: Option[Seq[String]] = None
  def sourceType: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Enabled" -> enabled.map(Formattable(_)),
    "EventCategories" -> eventCategories.map(Formattable(_)),
    "SnsTopicArn" -> Some(Formattable(snsTopicArn)),
    "SourceIds" -> sourceIds.map(Formattable(_)),
    "SourceType" -> sourceType.map(Formattable(_))
  )
}
