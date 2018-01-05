package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html
 */

case class CloudWatchAlarmDefinition(
    comparisonOperator: String,
    dimensions: Option[Seq[MetricDimension]] = None,
    evaluationPeriods: Option[Int] = None,
    metricName: String,
    namespace: Option[String] = None,
    period: Int,
    statistic: Option[String] = None,
    threshold: Double,
    unit: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ComparisonOperator" -> Some(Formattable(comparisonOperator)),
    "Dimensions" -> dimensions.map(Formattable(_)),
    "EvaluationPeriods" -> evaluationPeriods.map(Formattable(_)),
    "MetricName" -> Some(Formattable(metricName)),
    "Namespace" -> namespace.map(Formattable(_)),
    "Period" -> Some(Formattable(period)),
    "Statistic" -> statistic.map(Formattable(_)),
    "Threshold" -> Some(Formattable(threshold)),
    "Unit" -> unit.map(Formattable(_))
  )
}
