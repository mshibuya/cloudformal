package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html
 */

trait ApplicationVersion extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ElasticBeanstalk::ApplicationVersion"

  def applicationName: NonEmptyProperty[String]
  def description: Property[String] = Empty
  def sourceBundle: NonEmptyProperty[SourceBundle]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ApplicationName" -> applicationName,
    "Description" -> description,
    "SourceBundle" -> sourceBundle
  )
}
