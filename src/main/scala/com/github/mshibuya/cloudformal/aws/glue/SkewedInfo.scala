package com.github.mshibuya.cloudformal.aws.glue

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html
 */

case class SkewedInfo(
    skewedColumnNames: Option[Seq[String]] = None,
    skewedColumnValues: Option[Seq[String]] = None,
    skewedColumnValueLocationMaps: Option[Json] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "SkewedColumnNames" -> skewedColumnNames.map(Formattable(_)),
    "SkewedColumnValues" -> skewedColumnValues.map(Formattable(_)),
    "SkewedColumnValueLocationMaps" -> skewedColumnValueLocationMaps.map(Formattable(_))
  )
}
