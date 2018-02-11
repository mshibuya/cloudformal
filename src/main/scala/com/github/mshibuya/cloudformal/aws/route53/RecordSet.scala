package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html
 */

trait RecordSet extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Route53::RecordSet"

  def aliasTarget: Property[AliasTarget] = Empty
  def comment: Property[String] = Empty
  def failover: Property[String] = Empty
  def geoLocation: Property[GeoLocation] = Empty
  def healthCheckId: Property[String] = Empty
  def hostedZoneId: Property[String] = Empty
  def hostedZoneName: Property[String] = Empty
  def name: NonEmptyProperty[String]
  def region: Property[String] = Empty
  def resourceRecords: Property[Seq[String]] = Empty
  def setIdentifier: Property[String] = Empty
  def ttL: Property[String] = Empty
  def `type`: NonEmptyProperty[String]
  def weight: Property[Int] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AliasTarget" -> aliasTarget,
    "Comment" -> comment,
    "Failover" -> failover,
    "GeoLocation" -> geoLocation,
    "HealthCheckId" -> healthCheckId,
    "HostedZoneId" -> hostedZoneId,
    "HostedZoneName" -> hostedZoneName,
    "Name" -> name,
    "Region" -> region,
    "ResourceRecords" -> resourceRecords,
    "SetIdentifier" -> setIdentifier,
    "TTL" -> ttL,
    "Type" -> `type`,
    "Weight" -> weight
  )
}
