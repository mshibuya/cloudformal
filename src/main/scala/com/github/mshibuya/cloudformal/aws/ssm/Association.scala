package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html
 */

trait Association extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::SSM::Association"

  def documentVersion: Property[String] = Empty
  def instanceId: Property[String] = Empty
  def name: NonEmptyProperty[String]
  def parameters: Property[ListMap[String, ParameterValues]] = Empty
  def scheduleExpression: Property[String] = Empty
  def targets: Property[Seq[Target]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "DocumentVersion" -> documentVersion,
    "InstanceId" -> instanceId,
    "Name" -> name,
    "Parameters" -> parameters,
    "ScheduleExpression" -> scheduleExpression,
    "Targets" -> targets
  )
}
