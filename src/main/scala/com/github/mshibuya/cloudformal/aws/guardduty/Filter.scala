package com.github.mshibuya.cloudformal.aws.guardduty

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html
 */

trait Filter extends Resource[Filter] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::GuardDuty::Filter"

  def action: NonEmptyProperty[String]
  def description: NonEmptyProperty[String]
  def detectorId: NonEmptyProperty[String]
  def findingCriteria: NonEmptyProperty[FindingCriteria]
  def rank: NonEmptyProperty[Int]
  def name: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "Action" -> action,
    "Description" -> description,
    "DetectorId" -> detectorId,
    "FindingCriteria" -> findingCriteria,
    "Rank" -> rank,
    "Name" -> name
  )
}
