package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html
 */

trait Step extends Resource {
  val resourceTypeName = "AWS::EMR::Step"

  def actionOnFailure: NonEmptyProperty[String]
  def hadoopJarStep: NonEmptyProperty[HadoopJarStepConfig]
  def jobFlowId: NonEmptyProperty[String]
  def name: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ActionOnFailure" -> actionOnFailure,
    "HadoopJarStep" -> hadoopJarStep,
    "JobFlowId" -> jobFlowId,
    "Name" -> name
  )
}
