package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html
 */

case class GitHubLocation(
    commitId: String,
    repository: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "CommitId" -> Some(Formattable(commitId)),
    "Repository" -> Some(Formattable(repository))
  )
}
