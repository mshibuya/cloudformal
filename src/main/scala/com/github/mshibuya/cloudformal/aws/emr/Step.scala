package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html
 */

trait Step extends Resource[Step] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EMR::Step"

  def actionOnFailure: NonEmptyProperty[String]
  def hadoopJarStep: NonEmptyProperty[HadoopJarStepConfig]
  def jobFlowId: NonEmptyProperty[String]
  def name: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "ActionOnFailure" -> actionOnFailure,
    "HadoopJarStep" -> hadoopJarStep,
    "JobFlowId" -> jobFlowId,
    "Name" -> name
  )
}
