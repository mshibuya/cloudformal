package com.github.mshibuya.cloudformal.aws.batch

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html
 */

trait JobQueue extends Resource[JobQueue] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Batch::JobQueue"

  def computeEnvironmentOrder: NonEmptyProperty[Seq[ComputeEnvironmentOrder]]
  def priority: NonEmptyProperty[Int]
  def state: Property[String] = Empty
  def jobQueueName: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "ComputeEnvironmentOrder" -> computeEnvironmentOrder,
    "Priority" -> priority,
    "State" -> state,
    "JobQueueName" -> jobQueueName
  )
}
