package com.github.mshibuya.cloudformal.aws.guardduty

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html
 */

trait Member extends Resource[Member] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::GuardDuty::Member"

  def status: Property[String] = Empty
  def memberId: NonEmptyProperty[String]
  def email: NonEmptyProperty[String]
  def message: Property[String] = Empty
  def detectorId: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "Status" -> status,
    "MemberId" -> memberId,
    "Email" -> email,
    "Message" -> message,
    "DetectorId" -> detectorId
  )
}
