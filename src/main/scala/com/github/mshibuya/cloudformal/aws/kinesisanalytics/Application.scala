package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html
 */

trait Application extends Resource[Application] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::KinesisAnalytics::Application"

  def applicationName: Property[String] = Empty
  def inputs: NonEmptyProperty[Seq[Input]]
  def applicationDescription: Property[String] = Empty
  def applicationCode: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "ApplicationName" -> applicationName,
    "Inputs" -> inputs,
    "ApplicationDescription" -> applicationDescription,
    "ApplicationCode" -> applicationCode
  )
}
