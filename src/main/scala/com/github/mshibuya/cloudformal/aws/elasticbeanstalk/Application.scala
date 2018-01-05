package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html
 */

trait Application extends Resource {
  val resourceTypeName = "AWS::ElasticBeanstalk::Application"

  def applicationName: Option[String] = None
  def description: Option[String] = None
  def resourceLifecycleConfig: Option[ApplicationResourceLifecycleConfig] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "ApplicationName" -> applicationName.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "ResourceLifecycleConfig" -> resourceLifecycleConfig.map(Formattable(_))
  )
}
