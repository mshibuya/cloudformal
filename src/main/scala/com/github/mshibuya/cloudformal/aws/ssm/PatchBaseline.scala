package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html
 */

trait PatchBaseline extends Resource {
  val resourceTypeName = "AWS::SSM::PatchBaseline"

  def operatingSystem: Option[String] = None
  def approvedPatches: Option[Seq[String]] = None
  def patchGroups: Option[Seq[String]] = None
  def description: Option[String] = None
  def approvedPatchesComplianceLevel: Option[String] = None
  def approvalRules: Option[RuleGroup] = None
  def globalFilters: Option[PatchFilterGroup] = None
  def name: String
  def rejectedPatches: Option[Seq[String]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "OperatingSystem" -> operatingSystem.map(Formattable(_)),
    "ApprovedPatches" -> approvedPatches.map(Formattable(_)),
    "PatchGroups" -> patchGroups.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "ApprovedPatchesComplianceLevel" -> approvedPatchesComplianceLevel.map(Formattable(_)),
    "ApprovalRules" -> approvalRules.map(Formattable(_)),
    "GlobalFilters" -> globalFilters.map(Formattable(_)),
    "Name" -> Some(Formattable(name)),
    "RejectedPatches" -> rejectedPatches.map(Formattable(_))
  )
}
