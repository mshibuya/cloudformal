package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html
 */

case class GitHubLocation(
    commitId: NonEmptyProperty[String],
    repository: NonEmptyProperty[String]) extends Expression[GitHubLocation] {
  def render: Formattable = Value(
    "CommitId" -> commitId,
    "Repository" -> repository
  )
}
