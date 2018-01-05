package com.github.mshibuya.cloudformal.aws.stepfunctions

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html
 */

trait StateMachine extends Resource {
  val resourceTypeName = "AWS::StepFunctions::StateMachine"

  def definitionString: String
  def stateMachineName: Option[String] = None
  def roleArn: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "DefinitionString" -> Some(Formattable(definitionString)),
    "StateMachineName" -> stateMachineName.map(Formattable(_)),
    "RoleArn" -> Some(Formattable(roleArn))
  )
}
