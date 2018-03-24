package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-application.html
 */

case class Application(
    additionalInfo: Property[ListMap[String, String]] = Empty,
    args: Property[Seq[String]] = Empty,
    name: Property[String] = Empty,
    version: Property[String] = Empty) extends Expression[Application] {
  def render: Formattable = Value(
    "AdditionalInfo" -> additionalInfo,
    "Args" -> args,
    "Name" -> name,
    "Version" -> version
  )
}
