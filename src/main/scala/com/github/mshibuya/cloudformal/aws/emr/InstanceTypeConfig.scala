package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html
 */

case class InstanceTypeConfig(
    bidPrice: Option[String] = None,
    bidPriceAsPercentageOfOnDemandPrice: Option[Double] = None,
    configurations: Option[Seq[Configuration]] = None,
    ebsConfiguration: Option[EbsConfiguration] = None,
    instanceType: String,
    weightedCapacity: Option[Int] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "BidPrice" -> bidPrice.map(Formattable(_)),
    "BidPriceAsPercentageOfOnDemandPrice" -> bidPriceAsPercentageOfOnDemandPrice.map(Formattable(_)),
    "Configurations" -> configurations.map(Formattable(_)),
    "EbsConfiguration" -> ebsConfiguration.map(Formattable(_)),
    "InstanceType" -> Some(Formattable(instanceType)),
    "WeightedCapacity" -> weightedCapacity.map(Formattable(_))
  )
}
