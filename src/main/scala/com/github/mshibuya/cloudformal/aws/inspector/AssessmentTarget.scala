package com.github.mshibuya.cloudformal.aws.inspector

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html
 */

trait AssessmentTarget extends Resource {
  val resourceTypeName = "AWS::Inspector::AssessmentTarget"

  def assessmentTargetName: Option[String] = None
  def resourceGroupArn: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "AssessmentTargetName" -> assessmentTargetName.map(Formattable(_)),
    "ResourceGroupArn" -> Some(Formattable(resourceGroupArn))
  )
}
