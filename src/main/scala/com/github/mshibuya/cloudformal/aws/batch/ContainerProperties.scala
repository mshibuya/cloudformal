package com.github.mshibuya.cloudformal.aws.batch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html
 */

case class ContainerProperties(
    mountPoints: Option[Seq[MountPoints]] = None,
    user: Option[String] = None,
    volumes: Option[Seq[Volumes]] = None,
    command: Option[Seq[String]] = None,
    memory: Int,
    privileged: Option[Boolean] = None,
    environment: Option[Seq[Environment]] = None,
    jobRoleArn: Option[String] = None,
    readonlyRootFilesystem: Option[Boolean] = None,
    ulimits: Option[Seq[Ulimit]] = None,
    vcpus: Int,
    image: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "MountPoints" -> mountPoints.map(Formattable(_)),
    "User" -> user.map(Formattable(_)),
    "Volumes" -> volumes.map(Formattable(_)),
    "Command" -> command.map(Formattable(_)),
    "Memory" -> Some(Formattable(memory)),
    "Privileged" -> privileged.map(Formattable(_)),
    "Environment" -> environment.map(Formattable(_)),
    "JobRoleArn" -> jobRoleArn.map(Formattable(_)),
    "ReadonlyRootFilesystem" -> readonlyRootFilesystem.map(Formattable(_)),
    "Ulimits" -> ulimits.map(Formattable(_)),
    "Vcpus" -> Some(Formattable(vcpus)),
    "Image" -> Some(Formattable(image))
  )
}
