package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html
 */

case class HadoopJarStepConfig(
    args: Option[Seq[String]] = None,
    jar: String,
    mainClass: Option[String] = None,
    stepProperties: Option[Seq[KeyValue]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Args" -> args.map(Formattable(_)),
    "Jar" -> Some(Formattable(jar)),
    "MainClass" -> mainClass.map(Formattable(_)),
    "StepProperties" -> stepProperties.map(Formattable(_))
  )
}
