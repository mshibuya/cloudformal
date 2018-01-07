package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html
 */

case class ContainerDefinition(
    command: Property[Seq[String]] = Empty,
    cpu: Property[Int] = Empty,
    disableNetworking: Property[Boolean] = Empty,
    dnsSearchDomains: Property[Seq[String]] = Empty,
    dnsServers: Property[Seq[String]] = Empty,
    dockerLabels: Property[ListMap[String, String]] = Empty,
    dockerSecurityOptions: Property[Seq[String]] = Empty,
    entryPoint: Property[Seq[String]] = Empty,
    environment: Property[Seq[KeyValuePair]] = Empty,
    essential: Property[Boolean] = Empty,
    extraHosts: Property[Seq[HostEntry]] = Empty,
    hostname: Property[String] = Empty,
    image: Property[String] = Empty,
    links: Property[Seq[String]] = Empty,
    linuxParameters: Property[LinuxParameters] = Empty,
    logConfiguration: Property[LogConfiguration] = Empty,
    memory: Property[Int] = Empty,
    memoryReservation: Property[Int] = Empty,
    mountPoints: Property[Seq[MountPoint]] = Empty,
    name: Property[String] = Empty,
    portMappings: Property[Seq[PortMapping]] = Empty,
    privileged: Property[Boolean] = Empty,
    readonlyRootFilesystem: Property[Boolean] = Empty,
    ulimits: Property[Seq[Ulimit]] = Empty,
    user: Property[String] = Empty,
    volumesFrom: Property[Seq[VolumeFrom]] = Empty,
    workingDirectory: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Command" -> command,
    "Cpu" -> cpu,
    "DisableNetworking" -> disableNetworking,
    "DnsSearchDomains" -> dnsSearchDomains,
    "DnsServers" -> dnsServers,
    "DockerLabels" -> dockerLabels,
    "DockerSecurityOptions" -> dockerSecurityOptions,
    "EntryPoint" -> entryPoint,
    "Environment" -> environment,
    "Essential" -> essential,
    "ExtraHosts" -> extraHosts,
    "Hostname" -> hostname,
    "Image" -> image,
    "Links" -> links,
    "LinuxParameters" -> linuxParameters,
    "LogConfiguration" -> logConfiguration,
    "Memory" -> memory,
    "MemoryReservation" -> memoryReservation,
    "MountPoints" -> mountPoints,
    "Name" -> name,
    "PortMappings" -> portMappings,
    "Privileged" -> privileged,
    "ReadonlyRootFilesystem" -> readonlyRootFilesystem,
    "Ulimits" -> ulimits,
    "User" -> user,
    "VolumesFrom" -> volumesFrom,
    "WorkingDirectory" -> workingDirectory
  )
}
