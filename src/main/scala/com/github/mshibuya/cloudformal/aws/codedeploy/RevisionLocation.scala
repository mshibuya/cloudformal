package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html
 */

case class RevisionLocation(
    gitHubLocation: Option[GitHubLocation] = None,
    revisionType: Option[String] = None,
    s3Location: Option[S3Location] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "GitHubLocation" -> gitHubLocation.map(Formattable(_)),
    "RevisionType" -> revisionType.map(Formattable(_)),
    "S3Location" -> s3Location.map(Formattable(_))
  )
}
