package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html
 */

trait Step extends Resource {
  val resourceTypeName = "AWS::EMR::Step"

  def actionOnFailure: String
  def hadoopJarStep: HadoopJarStepConfig
  def jobFlowId: String
  def name: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "ActionOnFailure" -> Some(Formattable(actionOnFailure)),
    "HadoopJarStep" -> Some(Formattable(hadoopJarStep)),
    "JobFlowId" -> Some(Formattable(jobFlowId)),
    "Name" -> Some(Formattable(name))
  )
}
