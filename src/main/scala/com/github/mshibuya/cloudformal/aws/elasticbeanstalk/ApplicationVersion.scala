package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html
 */

trait ApplicationVersion extends Resource {
  val resourceTypeName = "AWS::ElasticBeanstalk::ApplicationVersion"

  def applicationName: String
  def description: Option[String] = None
  def sourceBundle: SourceBundle

  def resourceProperties: FormattableMap = Formattable.opt(
    "ApplicationName" -> Some(Formattable(applicationName)),
    "Description" -> description.map(Formattable(_)),
    "SourceBundle" -> Some(Formattable(sourceBundle))
  )
}
