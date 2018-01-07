package com.github.mshibuya.cloudformal.aws.inspector

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html
 */

trait AssessmentTarget extends Resource {
  val resourceTypeName = "AWS::Inspector::AssessmentTarget"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def assessmentTargetName: Property[String] = Empty
  def resourceGroupArn: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AssessmentTargetName" -> assessmentTargetName,
    "ResourceGroupArn" -> resourceGroupArn
  )
}
