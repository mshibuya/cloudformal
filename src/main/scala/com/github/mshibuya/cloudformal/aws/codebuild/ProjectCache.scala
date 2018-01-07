package com.github.mshibuya.cloudformal.aws.codebuild

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html
 */

case class ProjectCache(
    `type`: NonEmptyProperty[String],
    location: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Type" -> `type`,
    "Location" -> location
  )
}
