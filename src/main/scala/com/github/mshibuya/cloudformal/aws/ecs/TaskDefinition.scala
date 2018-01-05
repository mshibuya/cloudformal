package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html
 */

trait TaskDefinition extends Resource {
  val resourceTypeName = "AWS::ECS::TaskDefinition"

  def containerDefinitions: Option[Seq[ContainerDefinition]] = None
  def cpu: Option[String] = None
  def executionRoleArn: Option[String] = None
  def family: Option[String] = None
  def memory: Option[String] = None
  def networkMode: Option[String] = None
  def placementConstraints: Option[Seq[TaskDefinitionPlacementConstraint]] = None
  def requiresCompatibilities: Option[Seq[String]] = None
  def taskRoleArn: Option[String] = None
  def volumes: Option[Seq[Volume]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "ContainerDefinitions" -> containerDefinitions.map(Formattable(_)),
    "Cpu" -> cpu.map(Formattable(_)),
    "ExecutionRoleArn" -> executionRoleArn.map(Formattable(_)),
    "Family" -> family.map(Formattable(_)),
    "Memory" -> memory.map(Formattable(_)),
    "NetworkMode" -> networkMode.map(Formattable(_)),
    "PlacementConstraints" -> placementConstraints.map(Formattable(_)),
    "RequiresCompatibilities" -> requiresCompatibilities.map(Formattable(_)),
    "TaskRoleArn" -> taskRoleArn.map(Formattable(_)),
    "Volumes" -> volumes.map(Formattable(_))
  )
}
