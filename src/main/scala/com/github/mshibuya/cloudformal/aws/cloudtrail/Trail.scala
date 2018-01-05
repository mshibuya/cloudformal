package com.github.mshibuya.cloudformal.aws.cloudtrail

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html
 */

trait Trail extends Resource {
  val resourceTypeName = "AWS::CloudTrail::Trail"

  def cloudWatchLogsLogGroupArn: Option[String] = None
  def cloudWatchLogsRoleArn: Option[String] = None
  def enableLogFileValidation: Option[Boolean] = None
  def eventSelectors: Option[Seq[EventSelector]] = None
  def includeGlobalServiceEvents: Option[Boolean] = None
  def isLogging: Boolean
  def isMultiRegionTrail: Option[Boolean] = None
  def kMSKeyId: Option[String] = None
  def s3BucketName: String
  def s3KeyPrefix: Option[String] = None
  def snsTopicName: Option[String] = None
  def tags: Option[Seq[Tag]] = None
  def trailName: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "CloudWatchLogsLogGroupArn" -> cloudWatchLogsLogGroupArn.map(Formattable(_)),
    "CloudWatchLogsRoleArn" -> cloudWatchLogsRoleArn.map(Formattable(_)),
    "EnableLogFileValidation" -> enableLogFileValidation.map(Formattable(_)),
    "EventSelectors" -> eventSelectors.map(Formattable(_)),
    "IncludeGlobalServiceEvents" -> includeGlobalServiceEvents.map(Formattable(_)),
    "IsLogging" -> Some(Formattable(isLogging)),
    "IsMultiRegionTrail" -> isMultiRegionTrail.map(Formattable(_)),
    "KMSKeyId" -> kMSKeyId.map(Formattable(_)),
    "S3BucketName" -> Some(Formattable(s3BucketName)),
    "S3KeyPrefix" -> s3KeyPrefix.map(Formattable(_)),
    "SnsTopicName" -> snsTopicName.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "TrailName" -> trailName.map(Formattable(_))
  )
}
