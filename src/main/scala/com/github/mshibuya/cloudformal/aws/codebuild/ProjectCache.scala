package com.github.mshibuya.cloudformal.aws.codebuild

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html
 */

case class ProjectCache(
    `type`: NonEmptyProperty[String],
    location: Property[String] = Empty) extends Expression[ProjectCache] {
  def render: Formattable = Value(
    "Type" -> `type`,
    "Location" -> location
  )
}
