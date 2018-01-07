package com.github.mshibuya.cloudformal.aws.batch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html
 */

case class ContainerProperties(
    mountPoints: Property[Seq[MountPoints]] = Empty,
    user: Property[String] = Empty,
    volumes: Property[Seq[Volumes]] = Empty,
    command: Property[Seq[String]] = Empty,
    memory: NonEmptyProperty[Int],
    privileged: Property[Boolean] = Empty,
    environment: Property[Seq[Environment]] = Empty,
    jobRoleArn: Property[String] = Empty,
    readonlyRootFilesystem: Property[Boolean] = Empty,
    ulimits: Property[Seq[Ulimit]] = Empty,
    vcpus: NonEmptyProperty[Int],
    image: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "MountPoints" -> mountPoints,
    "User" -> user,
    "Volumes" -> volumes,
    "Command" -> command,
    "Memory" -> memory,
    "Privileged" -> privileged,
    "Environment" -> environment,
    "JobRoleArn" -> jobRoleArn,
    "ReadonlyRootFilesystem" -> readonlyRootFilesystem,
    "Ulimits" -> ulimits,
    "Vcpus" -> vcpus,
    "Image" -> image
  )
}
