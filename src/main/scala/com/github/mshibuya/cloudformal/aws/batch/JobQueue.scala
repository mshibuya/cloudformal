package com.github.mshibuya.cloudformal.aws.batch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html
 */

trait JobQueue extends Resource {
  val resourceTypeName = "AWS::Batch::JobQueue"

  def computeEnvironmentOrder: Seq[ComputeEnvironmentOrder]
  def priority: Int
  def state: Option[String] = None
  def jobQueueName: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "ComputeEnvironmentOrder" -> Some(Formattable(computeEnvironmentOrder)),
    "Priority" -> Some(Formattable(priority)),
    "State" -> state.map(Formattable(_)),
    "JobQueueName" -> jobQueueName.map(Formattable(_))
  )
}
