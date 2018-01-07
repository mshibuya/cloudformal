package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html
 */

case class Deployment(
    description: Property[String] = Empty,
    ignoreApplicationStopFailures: Property[Boolean] = Empty,
    revision: NonEmptyProperty[RevisionLocation]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Description" -> description,
    "IgnoreApplicationStopFailures" -> ignoreApplicationStopFailures,
    "Revision" -> revision
  )
}
