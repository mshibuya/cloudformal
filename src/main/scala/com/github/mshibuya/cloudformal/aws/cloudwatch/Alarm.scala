package com.github.mshibuya.cloudformal.aws.cloudwatch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html
 */

trait Alarm extends Resource {
  val resourceTypeName = "AWS::CloudWatch::Alarm"

  def actionsEnabled: Option[Boolean] = None
  def alarmActions: Option[Seq[String]] = None
  def alarmDescription: Option[String] = None
  def alarmName: Option[String] = None
  def comparisonOperator: String
  def dimensions: Option[Seq[Dimension]] = None
  def evaluateLowSampleCountPercentile: Option[String] = None
  def evaluationPeriods: Int
  def extendedStatistic: Option[String] = None
  def insufficientDataActions: Option[Seq[String]] = None
  def metricName: String
  def namespace: String
  def oKActions: Option[Seq[String]] = None
  def period: Int
  def statistic: Option[String] = None
  def threshold: Double
  def treatMissingData: Option[String] = None
  def unit: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "ActionsEnabled" -> actionsEnabled.map(Formattable(_)),
    "AlarmActions" -> alarmActions.map(Formattable(_)),
    "AlarmDescription" -> alarmDescription.map(Formattable(_)),
    "AlarmName" -> alarmName.map(Formattable(_)),
    "ComparisonOperator" -> Some(Formattable(comparisonOperator)),
    "Dimensions" -> dimensions.map(Formattable(_)),
    "EvaluateLowSampleCountPercentile" -> evaluateLowSampleCountPercentile.map(Formattable(_)),
    "EvaluationPeriods" -> Some(Formattable(evaluationPeriods)),
    "ExtendedStatistic" -> extendedStatistic.map(Formattable(_)),
    "InsufficientDataActions" -> insufficientDataActions.map(Formattable(_)),
    "MetricName" -> Some(Formattable(metricName)),
    "Namespace" -> Some(Formattable(namespace)),
    "OKActions" -> oKActions.map(Formattable(_)),
    "Period" -> Some(Formattable(period)),
    "Statistic" -> statistic.map(Formattable(_)),
    "Threshold" -> Some(Formattable(threshold)),
    "TreatMissingData" -> treatMissingData.map(Formattable(_)),
    "Unit" -> unit.map(Formattable(_))
  )
}
