package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html
 */

trait Bucket extends Resource {
  val resourceTypeName = "AWS::S3::Bucket"

  def accelerateConfiguration: Option[AccelerateConfiguration] = None
  def accessControl: Option[String] = None
  def analyticsConfigurations: Option[Seq[AnalyticsConfiguration]] = None
  def bucketName: Option[String] = None
  def corsConfiguration: Option[CorsConfiguration] = None
  def inventoryConfigurations: Option[Seq[InventoryConfiguration]] = None
  def lifecycleConfiguration: Option[LifecycleConfiguration] = None
  def loggingConfiguration: Option[LoggingConfiguration] = None
  def metricsConfigurations: Option[Seq[MetricsConfiguration]] = None
  def notificationConfiguration: Option[NotificationConfiguration] = None
  def replicationConfiguration: Option[ReplicationConfiguration] = None
  def tags: Option[Seq[Tag]] = None
  def versioningConfiguration: Option[VersioningConfiguration] = None
  def websiteConfiguration: Option[WebsiteConfiguration] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AccelerateConfiguration" -> accelerateConfiguration.map(Formattable(_)),
    "AccessControl" -> accessControl.map(Formattable(_)),
    "AnalyticsConfigurations" -> analyticsConfigurations.map(Formattable(_)),
    "BucketName" -> bucketName.map(Formattable(_)),
    "CorsConfiguration" -> corsConfiguration.map(Formattable(_)),
    "InventoryConfigurations" -> inventoryConfigurations.map(Formattable(_)),
    "LifecycleConfiguration" -> lifecycleConfiguration.map(Formattable(_)),
    "LoggingConfiguration" -> loggingConfiguration.map(Formattable(_)),
    "MetricsConfigurations" -> metricsConfigurations.map(Formattable(_)),
    "NotificationConfiguration" -> notificationConfiguration.map(Formattable(_)),
    "ReplicationConfiguration" -> replicationConfiguration.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "VersioningConfiguration" -> versioningConfiguration.map(Formattable(_)),
    "WebsiteConfiguration" -> websiteConfiguration.map(Formattable(_))
  )
}
