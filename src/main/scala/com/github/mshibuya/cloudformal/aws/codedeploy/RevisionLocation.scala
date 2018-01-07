package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html
 */

case class RevisionLocation(
    gitHubLocation: Property[GitHubLocation] = Empty,
    revisionType: Property[String] = Empty,
    s3Location: Property[S3Location] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "GitHubLocation" -> gitHubLocation,
    "RevisionType" -> revisionType,
    "S3Location" -> s3Location
  )
}
