package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html
 */

trait Bucket extends Resource {
  val resourceTypeName = "AWS::S3::Bucket"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  def domainNameAttribute: Expression[String] = Fn.GetAtt(logicalId, "DomainName")
  def dualStackDomainNameAttribute: Expression[String] = Fn.GetAtt(logicalId, "DualStackDomainName")
  def websiteURLAttribute: Expression[String] = Fn.GetAtt(logicalId, "WebsiteURL")

  def accelerateConfiguration: Property[AccelerateConfiguration] = Empty
  def accessControl: Property[String] = Empty
  def analyticsConfigurations: Property[Seq[AnalyticsConfiguration]] = Empty
  def bucketName: Property[String] = Empty
  def corsConfiguration: Property[CorsConfiguration] = Empty
  def inventoryConfigurations: Property[Seq[InventoryConfiguration]] = Empty
  def lifecycleConfiguration: Property[LifecycleConfiguration] = Empty
  def loggingConfiguration: Property[LoggingConfiguration] = Empty
  def metricsConfigurations: Property[Seq[MetricsConfiguration]] = Empty
  def notificationConfiguration: Property[NotificationConfiguration] = Empty
  def replicationConfiguration: Property[ReplicationConfiguration] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def versioningConfiguration: Property[VersioningConfiguration] = Empty
  def websiteConfiguration: Property[WebsiteConfiguration] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AccelerateConfiguration" -> accelerateConfiguration,
    "AccessControl" -> accessControl,
    "AnalyticsConfigurations" -> analyticsConfigurations,
    "BucketName" -> bucketName,
    "CorsConfiguration" -> corsConfiguration,
    "InventoryConfigurations" -> inventoryConfigurations,
    "LifecycleConfiguration" -> lifecycleConfiguration,
    "LoggingConfiguration" -> loggingConfiguration,
    "MetricsConfigurations" -> metricsConfigurations,
    "NotificationConfiguration" -> notificationConfiguration,
    "ReplicationConfiguration" -> replicationConfiguration,
    "Tags" -> tags,
    "VersioningConfiguration" -> versioningConfiguration,
    "WebsiteConfiguration" -> websiteConfiguration
  )
}
