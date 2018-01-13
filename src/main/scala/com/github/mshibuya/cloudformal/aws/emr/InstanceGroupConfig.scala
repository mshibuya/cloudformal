package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html
 */

trait InstanceGroupConfig extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EMR::InstanceGroupConfig"

  def autoScalingPolicy: Property[AutoScalingPolicy] = Empty
  def bidPrice: Property[String] = Empty
  def configurations: Property[Seq[Configuration]] = Empty
  def ebsConfiguration: Property[EbsConfiguration] = Empty
  def instanceCount: NonEmptyProperty[Int]
  def instanceRole: NonEmptyProperty[String]
  def instanceType: NonEmptyProperty[String]
  def jobFlowId: NonEmptyProperty[String]
  def market: Property[String] = Empty
  def name: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AutoScalingPolicy" -> autoScalingPolicy,
    "BidPrice" -> bidPrice,
    "Configurations" -> configurations,
    "EbsConfiguration" -> ebsConfiguration,
    "InstanceCount" -> instanceCount,
    "InstanceRole" -> instanceRole,
    "InstanceType" -> instanceType,
    "JobFlowId" -> jobFlowId,
    "Market" -> market,
    "Name" -> name
  )
}
