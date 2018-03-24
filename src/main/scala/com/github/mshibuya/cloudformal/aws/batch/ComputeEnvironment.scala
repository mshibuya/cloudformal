package com.github.mshibuya.cloudformal.aws.batch

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html
 */

trait ComputeEnvironment extends Resource[ComputeEnvironment] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Batch::ComputeEnvironment"

  def `type`: NonEmptyProperty[String]
  def serviceRole: NonEmptyProperty[String]
  def computeEnvironmentName: Property[String] = Empty
  def computeResources: NonEmptyProperty[ComputeResources]
  def state: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "Type" -> `type`,
    "ServiceRole" -> serviceRole,
    "ComputeEnvironmentName" -> computeEnvironmentName,
    "ComputeResources" -> computeResources,
    "State" -> state
  )
}
