package com.github.mshibuya.cloudformal.aws.stepfunctions

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html
 */

trait StateMachine extends Resource[StateMachine] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::StepFunctions::StateMachine"

  object attributes {
    val name: Expression[String] = Fn.GetAtt(logicalId, "Name")
  }

  def definitionString: NonEmptyProperty[String]
  def stateMachineName: Property[String] = Empty
  def roleArn: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "DefinitionString" -> definitionString,
    "StateMachineName" -> stateMachineName,
    "RoleArn" -> roleArn
  )
}
