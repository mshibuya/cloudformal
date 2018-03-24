package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html
 */

trait ApplicationReferenceDataSource extends Resource[ApplicationReferenceDataSource] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::KinesisAnalytics::ApplicationReferenceDataSource"

  def applicationName: NonEmptyProperty[String]
  def referenceDataSource: NonEmptyProperty[ReferenceDataSource]

  def render(): MapValue[_] = Value(
    "ApplicationName" -> applicationName,
    "ReferenceDataSource" -> referenceDataSource
  )
}
