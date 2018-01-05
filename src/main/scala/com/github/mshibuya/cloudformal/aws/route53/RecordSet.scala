package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html
 */

trait RecordSet extends Resource {
  val resourceTypeName = "AWS::Route53::RecordSet"

  def aliasTarget: Option[AliasTarget] = None
  def comment: Option[String] = None
  def failover: Option[String] = None
  def geoLocation: Option[GeoLocation] = None
  def healthCheckId: Option[String] = None
  def hostedZoneId: Option[String] = None
  def hostedZoneName: Option[String] = None
  def name: String
  def region: Option[String] = None
  def resourceRecords: Option[Seq[String]] = None
  def setIdentifier: Option[String] = None
  def tTL: Option[String] = None
  def `type`: String
  def weight: Option[Int] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AliasTarget" -> aliasTarget.map(Formattable(_)),
    "Comment" -> comment.map(Formattable(_)),
    "Failover" -> failover.map(Formattable(_)),
    "GeoLocation" -> geoLocation.map(Formattable(_)),
    "HealthCheckId" -> healthCheckId.map(Formattable(_)),
    "HostedZoneId" -> hostedZoneId.map(Formattable(_)),
    "HostedZoneName" -> hostedZoneName.map(Formattable(_)),
    "Name" -> Some(Formattable(name)),
    "Region" -> region.map(Formattable(_)),
    "ResourceRecords" -> resourceRecords.map(Formattable(_)),
    "SetIdentifier" -> setIdentifier.map(Formattable(_)),
    "TTL" -> tTL.map(Formattable(_)),
    "Type" -> Some(Formattable(`type`)),
    "Weight" -> weight.map(Formattable(_))
  )
}
