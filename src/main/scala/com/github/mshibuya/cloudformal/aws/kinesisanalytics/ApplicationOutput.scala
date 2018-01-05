package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html
 */

trait ApplicationOutput extends Resource {
  val resourceTypeName = "AWS::KinesisAnalytics::ApplicationOutput"

  def applicationName: String
  def output: Output

  def resourceProperties: FormattableMap = Formattable.opt(
    "ApplicationName" -> Some(Formattable(applicationName)),
    "Output" -> Some(Formattable(output))
  )
}
