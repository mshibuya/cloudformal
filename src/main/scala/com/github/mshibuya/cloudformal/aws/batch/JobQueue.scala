package com.github.mshibuya.cloudformal.aws.batch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html
 */

trait JobQueue extends Resource {
  val resourceTypeName = "AWS::Batch::JobQueue"

  def computeEnvironmentOrder: NonEmptyProperty[Seq[ComputeEnvironmentOrder]]
  def priority: NonEmptyProperty[Int]
  def state: Property[String] = Empty
  def jobQueueName: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ComputeEnvironmentOrder" -> computeEnvironmentOrder,
    "Priority" -> priority,
    "State" -> state,
    "JobQueueName" -> jobQueueName
  )
}
