package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html
 */

case class Deployment(
    description: Option[String] = None,
    ignoreApplicationStopFailures: Option[Boolean] = None,
    revision: RevisionLocation) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Description" -> description.map(Formattable(_)),
    "IgnoreApplicationStopFailures" -> ignoreApplicationStopFailures.map(Formattable(_)),
    "Revision" -> Some(Formattable(revision))
  )
}
