package com.github.mshibuya.cloudformal.aws.batch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html
 */

trait ComputeEnvironment extends Resource {
  val resourceTypeName = "AWS::Batch::ComputeEnvironment"

  def `type`: String
  def serviceRole: String
  def computeEnvironmentName: Option[String] = None
  def computeResources: ComputeResources
  def state: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Type" -> Some(Formattable(`type`)),
    "ServiceRole" -> Some(Formattable(serviceRole)),
    "ComputeEnvironmentName" -> computeEnvironmentName.map(Formattable(_)),
    "ComputeResources" -> Some(Formattable(computeResources)),
    "State" -> state.map(Formattable(_))
  )
}
