package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html
 */

trait PatchBaseline extends Resource {
  val resourceTypeName = "AWS::SSM::PatchBaseline"

  def operatingSystem: Property[String] = Empty
  def approvedPatches: Property[Seq[String]] = Empty
  def patchGroups: Property[Seq[String]] = Empty
  def description: Property[String] = Empty
  def approvedPatchesComplianceLevel: Property[String] = Empty
  def approvalRules: Property[RuleGroup] = Empty
  def globalFilters: Property[PatchFilterGroup] = Empty
  def name: NonEmptyProperty[String]
  def rejectedPatches: Property[Seq[String]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "OperatingSystem" -> operatingSystem,
    "ApprovedPatches" -> approvedPatches,
    "PatchGroups" -> patchGroups,
    "Description" -> description,
    "ApprovedPatchesComplianceLevel" -> approvedPatchesComplianceLevel,
    "ApprovalRules" -> approvalRules,
    "GlobalFilters" -> globalFilters,
    "Name" -> name,
    "RejectedPatches" -> rejectedPatches
  )
}
