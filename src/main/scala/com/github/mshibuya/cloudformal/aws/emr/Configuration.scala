package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html
 */

case class Configuration(
    classification: Option[String] = None,
    configurationProperties: Option[ListMap[String, String]] = None,
    configurations: Option[Seq[Configuration]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Classification" -> classification.map(Formattable(_)),
    "ConfigurationProperties" -> configurationProperties.map(Formattable(_)),
    "Configurations" -> configurations.map(Formattable(_))
  )
}
