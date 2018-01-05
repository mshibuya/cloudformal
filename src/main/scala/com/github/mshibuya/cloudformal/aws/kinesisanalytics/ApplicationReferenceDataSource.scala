package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html
 */

trait ApplicationReferenceDataSource extends Resource {
  val resourceTypeName = "AWS::KinesisAnalytics::ApplicationReferenceDataSource"

  def applicationName: String
  def referenceDataSource: ReferenceDataSource

  def resourceProperties: FormattableMap = Formattable.opt(
    "ApplicationName" -> Some(Formattable(applicationName)),
    "ReferenceDataSource" -> Some(Formattable(referenceDataSource))
  )
}
