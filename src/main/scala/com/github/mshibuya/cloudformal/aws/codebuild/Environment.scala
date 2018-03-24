package com.github.mshibuya.cloudformal.aws.codebuild

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html
 */

case class Environment(
    `type`: NonEmptyProperty[String],
    environmentVariables: Property[Seq[EnvironmentVariable]] = Empty,
    privilegedMode: Property[Boolean] = Empty,
    image: NonEmptyProperty[String],
    computeType: NonEmptyProperty[String]) extends Expression[Environment] {
  def render: Formattable = Value(
    "Type" -> `type`,
    "EnvironmentVariables" -> environmentVariables,
    "PrivilegedMode" -> privilegedMode,
    "Image" -> image,
    "ComputeType" -> computeType
  )
}
