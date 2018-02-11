package com.github.mshibuya.cloudformal.aws.cloudtrail

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html
 */

trait Trail extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::CloudTrail::Trail"

  object attributes {
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
    val snsTopicArn: Expression[String] = Fn.GetAtt(logicalId, "SnsTopicArn")
  }

  def cloudWatchLogsLogGroupArn: Property[String] = Empty
  def cloudWatchLogsRoleArn: Property[String] = Empty
  def enableLogFileValidation: Property[Boolean] = Empty
  def eventSelectors: Property[Seq[EventSelector]] = Empty
  def includeGlobalServiceEvents: Property[Boolean] = Empty
  def isLogging: NonEmptyProperty[Boolean]
  def isMultiRegionTrail: Property[Boolean] = Empty
  def kmsKeyId: Property[String] = Empty
  def s3BucketName: NonEmptyProperty[String]
  def s3KeyPrefix: Property[String] = Empty
  def snsTopicName: Property[String] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def trailName: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "CloudWatchLogsLogGroupArn" -> cloudWatchLogsLogGroupArn,
    "CloudWatchLogsRoleArn" -> cloudWatchLogsRoleArn,
    "EnableLogFileValidation" -> enableLogFileValidation,
    "EventSelectors" -> eventSelectors,
    "IncludeGlobalServiceEvents" -> includeGlobalServiceEvents,
    "IsLogging" -> isLogging,
    "IsMultiRegionTrail" -> isMultiRegionTrail,
    "KMSKeyId" -> kmsKeyId,
    "S3BucketName" -> s3BucketName,
    "S3KeyPrefix" -> s3KeyPrefix,
    "SnsTopicName" -> snsTopicName,
    "Tags" -> tags,
    "TrailName" -> trailName
  )
}
