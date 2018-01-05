package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html
 */

case class ApplicationResourceLifecycleConfig(
    serviceRole: Option[String] = None,
    versionLifecycleConfig: Option[ApplicationVersionLifecycleConfig] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ServiceRole" -> serviceRole.map(Formattable(_)),
    "VersionLifecycleConfig" -> versionLifecycleConfig.map(Formattable(_))
  )
}
