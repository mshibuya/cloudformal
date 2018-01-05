package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-application.html
 */

case class Application(
    additionalInfo: Option[ListMap[String, String]] = None,
    args: Option[Seq[String]] = None,
    name: Option[String] = None,
    version: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AdditionalInfo" -> additionalInfo.map(Formattable(_)),
    "Args" -> args.map(Formattable(_)),
    "Name" -> name.map(Formattable(_)),
    "Version" -> version.map(Formattable(_))
  )
}
