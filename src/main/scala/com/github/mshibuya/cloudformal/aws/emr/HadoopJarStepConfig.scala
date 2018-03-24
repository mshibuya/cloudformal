package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html
 */

case class HadoopJarStepConfig(
    args: Property[Seq[String]] = Empty,
    jar: NonEmptyProperty[String],
    mainClass: Property[String] = Empty,
    stepProperties: Property[Seq[KeyValue]] = Empty) extends Expression[HadoopJarStepConfig] {
  def render: Formattable = Value(
    "Args" -> args,
    "Jar" -> jar,
    "MainClass" -> mainClass,
    "StepProperties" -> stepProperties
  )
}
