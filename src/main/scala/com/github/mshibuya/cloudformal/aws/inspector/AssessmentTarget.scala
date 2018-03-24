package com.github.mshibuya.cloudformal.aws.inspector

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html
 */

trait AssessmentTarget extends Resource[AssessmentTarget] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Inspector::AssessmentTarget"

  object attributes {
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def assessmentTargetName: Property[String] = Empty
  def resourceGroupArn: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "AssessmentTargetName" -> assessmentTargetName,
    "ResourceGroupArn" -> resourceGroupArn
  )
}
