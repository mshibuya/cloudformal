package com.github.mshibuya.cloudformal.aws.codebuild

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html
 */

case class Environment(
    `type`: String,
    environmentVariables: Option[Seq[EnvironmentVariable]] = None,
    privilegedMode: Option[Boolean] = None,
    image: String,
    computeType: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Type" -> Some(Formattable(`type`)),
    "EnvironmentVariables" -> environmentVariables.map(Formattable(_)),
    "PrivilegedMode" -> privilegedMode.map(Formattable(_)),
    "Image" -> Some(Formattable(image)),
    "ComputeType" -> Some(Formattable(computeType))
  )
}
