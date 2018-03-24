package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html
 */

trait Application extends Resource[Application] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ElasticBeanstalk::Application"

  def applicationName: Property[String] = Empty
  def description: Property[String] = Empty
  def resourceLifecycleConfig: Property[ApplicationResourceLifecycleConfig] = Empty

  def render(): MapValue[_] = Value(
    "ApplicationName" -> applicationName,
    "Description" -> description,
    "ResourceLifecycleConfig" -> resourceLifecycleConfig
  )
}
