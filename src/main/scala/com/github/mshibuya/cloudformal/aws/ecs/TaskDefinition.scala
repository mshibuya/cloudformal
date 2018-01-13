package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html
 */

trait TaskDefinition extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ECS::TaskDefinition"

  def containerDefinitions: Property[Seq[ContainerDefinition]] = Empty
  def cpu: Property[String] = Empty
  def executionRoleArn: Property[String] = Empty
  def family: Property[String] = Empty
  def memory: Property[String] = Empty
  def networkMode: Property[String] = Empty
  def placementConstraints: Property[Seq[TaskDefinitionPlacementConstraint]] = Empty
  def requiresCompatibilities: Property[Seq[String]] = Empty
  def taskRoleArn: Property[String] = Empty
  def volumes: Property[Seq[Volume]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ContainerDefinitions" -> containerDefinitions,
    "Cpu" -> cpu,
    "ExecutionRoleArn" -> executionRoleArn,
    "Family" -> family,
    "Memory" -> memory,
    "NetworkMode" -> networkMode,
    "PlacementConstraints" -> placementConstraints,
    "RequiresCompatibilities" -> requiresCompatibilities,
    "TaskRoleArn" -> taskRoleArn,
    "Volumes" -> volumes
  )
}
