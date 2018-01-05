package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html
 */

trait RecordSetGroup extends Resource {
  val resourceTypeName = "AWS::Route53::RecordSetGroup"

  def comment: Option[String] = None
  def hostedZoneId: Option[String] = None
  def hostedZoneName: Option[String] = None
  def recordSets: Option[Seq[RecordSet]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Comment" -> comment.map(Formattable(_)),
    "HostedZoneId" -> hostedZoneId.map(Formattable(_)),
    "HostedZoneName" -> hostedZoneName.map(Formattable(_)),
    "RecordSets" -> recordSets.map(Formattable(_))
  )
}
