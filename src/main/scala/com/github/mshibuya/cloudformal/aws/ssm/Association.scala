package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html
 */

trait Association extends Resource {
  val resourceTypeName = "AWS::SSM::Association"

  def documentVersion: Option[String] = None
  def instanceId: Option[String] = None
  def name: String
  def parameters: Option[ListMap[String, ParameterValues]] = None
  def scheduleExpression: Option[String] = None
  def targets: Option[Seq[Target]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "DocumentVersion" -> documentVersion.map(Formattable(_)),
    "InstanceId" -> instanceId.map(Formattable(_)),
    "Name" -> Some(Formattable(name)),
    "Parameters" -> parameters.map(Formattable(_)),
    "ScheduleExpression" -> scheduleExpression.map(Formattable(_)),
    "Targets" -> targets.map(Formattable(_))
  )
}
