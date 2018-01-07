package com.github.mshibuya.cloudformal.aws.cloudwatch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html
 */

trait Alarm extends Resource {
  val resourceTypeName = "AWS::CloudWatch::Alarm"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def actionsEnabled: Property[Boolean] = Empty
  def alarmActions: Property[Seq[String]] = Empty
  def alarmDescription: Property[String] = Empty
  def alarmName: Property[String] = Empty
  def comparisonOperator: NonEmptyProperty[String]
  def dimensions: Property[Seq[Dimension]] = Empty
  def evaluateLowSampleCountPercentile: Property[String] = Empty
  def evaluationPeriods: NonEmptyProperty[Int]
  def extendedStatistic: Property[String] = Empty
  def insufficientDataActions: Property[Seq[String]] = Empty
  def metricName: NonEmptyProperty[String]
  def namespace: NonEmptyProperty[String]
  def oKActions: Property[Seq[String]] = Empty
  def period: NonEmptyProperty[Int]
  def statistic: Property[String] = Empty
  def threshold: NonEmptyProperty[Double]
  def treatMissingData: Property[String] = Empty
  def unit: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ActionsEnabled" -> actionsEnabled,
    "AlarmActions" -> alarmActions,
    "AlarmDescription" -> alarmDescription,
    "AlarmName" -> alarmName,
    "ComparisonOperator" -> comparisonOperator,
    "Dimensions" -> dimensions,
    "EvaluateLowSampleCountPercentile" -> evaluateLowSampleCountPercentile,
    "EvaluationPeriods" -> evaluationPeriods,
    "ExtendedStatistic" -> extendedStatistic,
    "InsufficientDataActions" -> insufficientDataActions,
    "MetricName" -> metricName,
    "Namespace" -> namespace,
    "OKActions" -> oKActions,
    "Period" -> period,
    "Statistic" -> statistic,
    "Threshold" -> threshold,
    "TreatMissingData" -> treatMissingData,
    "Unit" -> unit
  )
}
