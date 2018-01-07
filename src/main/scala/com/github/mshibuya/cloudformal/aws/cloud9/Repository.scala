package com.github.mshibuya.cloudformal.aws.cloud9

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html
 */

case class Repository(
    pathComponent: NonEmptyProperty[String],
    repositoryUrl: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "PathComponent" -> pathComponent,
    "RepositoryUrl" -> repositoryUrl
  )
}
