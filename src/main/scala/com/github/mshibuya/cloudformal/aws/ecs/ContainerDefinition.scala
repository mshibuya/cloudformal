package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html
 */

case class ContainerDefinition(
    command: Option[Seq[String]] = None,
    cpu: Option[Int] = None,
    disableNetworking: Option[Boolean] = None,
    dnsSearchDomains: Option[Seq[String]] = None,
    dnsServers: Option[Seq[String]] = None,
    dockerLabels: Option[ListMap[String, String]] = None,
    dockerSecurityOptions: Option[Seq[String]] = None,
    entryPoint: Option[Seq[String]] = None,
    environment: Option[Seq[KeyValuePair]] = None,
    essential: Option[Boolean] = None,
    extraHosts: Option[Seq[HostEntry]] = None,
    hostname: Option[String] = None,
    image: Option[String] = None,
    links: Option[Seq[String]] = None,
    linuxParameters: Option[LinuxParameters] = None,
    logConfiguration: Option[LogConfiguration] = None,
    memory: Option[Int] = None,
    memoryReservation: Option[Int] = None,
    mountPoints: Option[Seq[MountPoint]] = None,
    name: Option[String] = None,
    portMappings: Option[Seq[PortMapping]] = None,
    privileged: Option[Boolean] = None,
    readonlyRootFilesystem: Option[Boolean] = None,
    ulimits: Option[Seq[Ulimit]] = None,
    user: Option[String] = None,
    volumesFrom: Option[Seq[VolumeFrom]] = None,
    workingDirectory: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Command" -> command.map(Formattable(_)),
    "Cpu" -> cpu.map(Formattable(_)),
    "DisableNetworking" -> disableNetworking.map(Formattable(_)),
    "DnsSearchDomains" -> dnsSearchDomains.map(Formattable(_)),
    "DnsServers" -> dnsServers.map(Formattable(_)),
    "DockerLabels" -> dockerLabels.map(Formattable(_)),
    "DockerSecurityOptions" -> dockerSecurityOptions.map(Formattable(_)),
    "EntryPoint" -> entryPoint.map(Formattable(_)),
    "Environment" -> environment.map(Formattable(_)),
    "Essential" -> essential.map(Formattable(_)),
    "ExtraHosts" -> extraHosts.map(Formattable(_)),
    "Hostname" -> hostname.map(Formattable(_)),
    "Image" -> image.map(Formattable(_)),
    "Links" -> links.map(Formattable(_)),
    "LinuxParameters" -> linuxParameters.map(Formattable(_)),
    "LogConfiguration" -> logConfiguration.map(Formattable(_)),
    "Memory" -> memory.map(Formattable(_)),
    "MemoryReservation" -> memoryReservation.map(Formattable(_)),
    "MountPoints" -> mountPoints.map(Formattable(_)),
    "Name" -> name.map(Formattable(_)),
    "PortMappings" -> portMappings.map(Formattable(_)),
    "Privileged" -> privileged.map(Formattable(_)),
    "ReadonlyRootFilesystem" -> readonlyRootFilesystem.map(Formattable(_)),
    "Ulimits" -> ulimits.map(Formattable(_)),
    "User" -> user.map(Formattable(_)),
    "VolumesFrom" -> volumesFrom.map(Formattable(_)),
    "WorkingDirectory" -> workingDirectory.map(Formattable(_))
  )
}
