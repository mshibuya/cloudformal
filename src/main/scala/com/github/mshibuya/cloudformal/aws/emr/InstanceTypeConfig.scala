package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html
 */

case class InstanceTypeConfig(
    bidPrice: Property[String] = Empty,
    bidPriceAsPercentageOfOnDemandPrice: Property[Double] = Empty,
    configurations: Property[Seq[Configuration]] = Empty,
    ebsConfiguration: Property[EbsConfiguration] = Empty,
    instanceType: NonEmptyProperty[String],
    weightedCapacity: Property[Int] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "BidPrice" -> bidPrice,
    "BidPriceAsPercentageOfOnDemandPrice" -> bidPriceAsPercentageOfOnDemandPrice,
    "Configurations" -> configurations,
    "EbsConfiguration" -> ebsConfiguration,
    "InstanceType" -> instanceType,
    "WeightedCapacity" -> weightedCapacity
  )
}
