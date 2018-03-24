package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html
 */

trait ApplicationOutput extends Resource[ApplicationOutput] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::KinesisAnalytics::ApplicationOutput"

  def applicationName: NonEmptyProperty[String]
  def output: NonEmptyProperty[Output]

  def render(): MapValue[_] = Value(
    "ApplicationName" -> applicationName,
    "Output" -> output
  )
}
