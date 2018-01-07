package com.github.mshibuya.cloudformal.aws.stepfunctions

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html
 */

trait StateMachine extends Resource {
  val resourceTypeName = "AWS::StepFunctions::StateMachine"

  def nameAttribute: Expression[String] = Fn.GetAtt(logicalId, "Name")

  def definitionString: NonEmptyProperty[String]
  def stateMachineName: Property[String] = Empty
  def roleArn: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "DefinitionString" -> definitionString,
    "StateMachineName" -> stateMachineName,
    "RoleArn" -> roleArn
  )
}
