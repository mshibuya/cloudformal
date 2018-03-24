package com.github.mshibuya.cloudformal.aws.guardduty

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html
 */

trait Master extends Resource[Master] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::GuardDuty::Master"

  def detectorId: NonEmptyProperty[String]
  def masterId: NonEmptyProperty[String]
  def invitationId: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "DetectorId" -> detectorId,
    "MasterId" -> masterId,
    "InvitationId" -> invitationId
  )
}
