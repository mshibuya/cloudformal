package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html
 */

case class CloudWatchAlarmDefinition(
    comparisonOperator: NonEmptyProperty[String],
    dimensions: Property[Seq[MetricDimension]] = Empty,
    evaluationPeriods: Property[Int] = Empty,
    metricName: NonEmptyProperty[String],
    namespace: Property[String] = Empty,
    period: NonEmptyProperty[Int],
    statistic: Property[String] = Empty,
    threshold: NonEmptyProperty[Double],
    unit: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ComparisonOperator" -> comparisonOperator,
    "Dimensions" -> dimensions,
    "EvaluationPeriods" -> evaluationPeriods,
    "MetricName" -> metricName,
    "Namespace" -> namespace,
    "Period" -> period,
    "Statistic" -> statistic,
    "Threshold" -> threshold,
    "Unit" -> unit
  )
}
