package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html
 */

trait ApplicationReferenceDataSource extends Resource {
  val resourceTypeName = "AWS::KinesisAnalytics::ApplicationReferenceDataSource"

  def applicationName: NonEmptyProperty[String]
  def referenceDataSource: NonEmptyProperty[ReferenceDataSource]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ApplicationName" -> applicationName,
    "ReferenceDataSource" -> referenceDataSource
  )
}
