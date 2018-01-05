package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html
 */

trait Application extends Resource {
  val resourceTypeName = "AWS::KinesisAnalytics::Application"

  def applicationName: Option[String] = None
  def inputs: Seq[Input]
  def applicationDescription: Option[String] = None
  def applicationCode: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "ApplicationName" -> applicationName.map(Formattable(_)),
    "Inputs" -> Some(Formattable(inputs)),
    "ApplicationDescription" -> applicationDescription.map(Formattable(_)),
    "ApplicationCode" -> applicationCode.map(Formattable(_))
  )
}
