package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html
 */

case class Placement(
    groupName: Property[String] = Empty,
    tenancy: Property[String] = Empty,
    availabilityZone: Property[String] = Empty,
    affinity: Property[String] = Empty,
    hostId: Property[String] = Empty) extends Expression[Placement] {
  def render: Formattable = Value(
    "GroupName" -> groupName,
    "Tenancy" -> tenancy,
    "AvailabilityZone" -> availabilityZone,
    "Affinity" -> affinity,
    "HostId" -> hostId
  )
}
