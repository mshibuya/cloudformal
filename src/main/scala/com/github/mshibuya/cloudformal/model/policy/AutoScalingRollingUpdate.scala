package com.github.mshibuya.cloudformal.model.policy

import com.github.mshibuya.cloudformal.model._

case class AutoScalingRollingUpdate(
    maxBatchSize: Property[Int] = Empty,
    minInstancesInService: Property[Int] = Empty,
    minSuccessfulInstancesPercent: Property[Int] = Empty,
    pauseTime: Property[String] = Empty,
    suspendProcesses: Property[String] = Empty,
    waitOnResourceSignals: Property[Boolean] = Empty) extends Expression[AutoScalingRollingUpdate] {
  def render: Formattable = Value(
    "MaxBatchSize" -> maxBatchSize,
    "MinInstancesInService" -> minInstancesInService,
    "MinSuccessfulInstancesPercent" -> minSuccessfulInstancesPercent,
    "PauseTime" -> pauseTime,
    "SuspendProcesses" -> suspendProcesses,
    "WaitOnResourceSignals" -> waitOnResourceSignals
  )
}