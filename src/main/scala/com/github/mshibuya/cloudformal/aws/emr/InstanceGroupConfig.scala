package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html
 */

trait InstanceGroupConfig extends Resource {
  val resourceTypeName = "AWS::EMR::InstanceGroupConfig"

  def autoScalingPolicy: Option[AutoScalingPolicy] = None
  def bidPrice: Option[String] = None
  def configurations: Option[Seq[Configuration]] = None
  def ebsConfiguration: Option[EbsConfiguration] = None
  def instanceCount: Int
  def instanceRole: String
  def instanceType: String
  def jobFlowId: String
  def market: Option[String] = None
  def name: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AutoScalingPolicy" -> autoScalingPolicy.map(Formattable(_)),
    "BidPrice" -> bidPrice.map(Formattable(_)),
    "Configurations" -> configurations.map(Formattable(_)),
    "EbsConfiguration" -> ebsConfiguration.map(Formattable(_)),
    "InstanceCount" -> Some(Formattable(instanceCount)),
    "InstanceRole" -> Some(Formattable(instanceRole)),
    "InstanceType" -> Some(Formattable(instanceType)),
    "JobFlowId" -> Some(Formattable(jobFlowId)),
    "Market" -> market.map(Formattable(_)),
    "Name" -> name.map(Formattable(_))
  )
}
