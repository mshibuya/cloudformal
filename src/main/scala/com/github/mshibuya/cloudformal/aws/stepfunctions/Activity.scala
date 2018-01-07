package com.github.mshibuya.cloudformal.aws.stepfunctions

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html
 */

trait Activity extends Resource {
  val resourceTypeName = "AWS::StepFunctions::Activity"

  def nameAttribute: Expression[String] = Fn.GetAtt(logicalId, "Name")

  def name: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Name" -> name
  )
}
