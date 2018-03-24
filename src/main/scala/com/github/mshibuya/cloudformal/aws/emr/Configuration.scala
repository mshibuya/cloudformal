package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html
 */

case class Configuration(
    classification: Property[String] = Empty,
    configurationProperties: Property[ListMap[String, String]] = Empty,
    configurations: Property[Seq[Configuration]] = Empty) extends Expression[Configuration] {
  def render: Formattable = Value(
    "Classification" -> classification,
    "ConfigurationProperties" -> configurationProperties,
    "Configurations" -> configurations
  )
}
