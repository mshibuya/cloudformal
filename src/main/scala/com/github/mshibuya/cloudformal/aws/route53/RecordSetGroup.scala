package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html
 */

trait RecordSetGroup extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Route53::RecordSetGroup"

  def comment: Property[String] = Empty
  def hostedZoneId: Property[String] = Empty
  def hostedZoneName: Property[String] = Empty
  def recordSets: Property[Seq[RecordSet]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Comment" -> comment,
    "HostedZoneId" -> hostedZoneId,
    "HostedZoneName" -> hostedZoneName,
    "RecordSets" -> recordSets
  )
}
