package com.github.mshibuya.cloudformal.aws.stepfunctions

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html
 */

trait Activity extends Resource {
  val resourceTypeName = "AWS::StepFunctions::Activity"

  def name: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "Name" -> Some(Formattable(name))
  )
}
