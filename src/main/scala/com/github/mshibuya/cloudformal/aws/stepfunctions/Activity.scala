package com.github.mshibuya.cloudformal.aws.stepfunctions

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html
 */

trait Activity extends Resource[Activity] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::StepFunctions::Activity"

  object attributes {
    val name: Expression[String] = Fn.GetAtt(logicalId, "Name")
  }

  def name: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "Name" -> name
  )
}
