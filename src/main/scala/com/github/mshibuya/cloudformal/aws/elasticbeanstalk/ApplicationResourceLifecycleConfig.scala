package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html
 */

case class ApplicationResourceLifecycleConfig(
    serviceRole: Property[String] = Empty,
    versionLifecycleConfig: Property[ApplicationVersionLifecycleConfig] = Empty) extends Expression[ApplicationResourceLifecycleConfig] {
  def render: Formattable = Value(
    "ServiceRole" -> serviceRole,
    "VersionLifecycleConfig" -> versionLifecycleConfig
  )
}
