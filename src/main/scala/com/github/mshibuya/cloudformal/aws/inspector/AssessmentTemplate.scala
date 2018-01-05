package com.github.mshibuya.cloudformal.aws.inspector

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html
 */

trait AssessmentTemplate extends Resource {
  val resourceTypeName = "AWS::Inspector::AssessmentTemplate"

  def assessmentTargetArn: String
  def durationInSeconds: Int
  def assessmentTemplateName: Option[String] = None
  def rulesPackageArns: Seq[String]
  def userAttributesForFindings: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AssessmentTargetArn" -> Some(Formattable(assessmentTargetArn)),
    "DurationInSeconds" -> Some(Formattable(durationInSeconds)),
    "AssessmentTemplateName" -> assessmentTemplateName.map(Formattable(_)),
    "RulesPackageArns" -> Some(Formattable(rulesPackageArns)),
    "UserAttributesForFindings" -> userAttributesForFindings.map(Formattable(_))
  )
}
