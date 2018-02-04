package com.github.mshibuya.cloudformal.aws.inspector

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html
 */

trait AssessmentTemplate extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Inspector::AssessmentTemplate"

  object attributes {
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def assessmentTargetArn: NonEmptyProperty[String]
  def durationInSeconds: NonEmptyProperty[Int]
  def assessmentTemplateName: Property[String] = Empty
  def rulesPackageArns: NonEmptyProperty[Seq[String]]
  def userAttributesForFindings: Property[Seq[Tag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AssessmentTargetArn" -> assessmentTargetArn,
    "DurationInSeconds" -> durationInSeconds,
    "AssessmentTemplateName" -> assessmentTemplateName,
    "RulesPackageArns" -> rulesPackageArns,
    "UserAttributesForFindings" -> userAttributesForFindings
  )
}
