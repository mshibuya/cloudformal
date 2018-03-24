package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html
 */

trait PatchBaseline extends Resource[PatchBaseline] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::SSM::PatchBaseline"

  def operatingSystem: Property[String] = Empty
  def approvedPatches: Property[Seq[String]] = Empty
  def patchGroups: Property[Seq[String]] = Empty
  def description: Property[String] = Empty
  def approvedPatchesComplianceLevel: Property[String] = Empty
  def approvedPatchesEnableNonSecurity: Property[Boolean] = Empty
  def approvalRules: Property[RuleGroup] = Empty
  def globalFilters: Property[PatchFilterGroup] = Empty
  def sources: Property[Seq[PatchSource]] = Empty
  def name: NonEmptyProperty[String]
  def rejectedPatches: Property[Seq[String]] = Empty

  def render(): MapValue[_] = Value(
    "OperatingSystem" -> operatingSystem,
    "ApprovedPatches" -> approvedPatches,
    "PatchGroups" -> patchGroups,
    "Description" -> description,
    "ApprovedPatchesComplianceLevel" -> approvedPatchesComplianceLevel,
    "ApprovedPatchesEnableNonSecurity" -> approvedPatchesEnableNonSecurity,
    "ApprovalRules" -> approvalRules,
    "GlobalFilters" -> globalFilters,
    "Sources" -> sources,
    "Name" -> name,
    "RejectedPatches" -> rejectedPatches
  )
}
