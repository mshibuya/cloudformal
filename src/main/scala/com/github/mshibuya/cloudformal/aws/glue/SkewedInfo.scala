package com.github.mshibuya.cloudformal.aws.glue

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html
 */

case class SkewedInfo(
    skewedColumnNames: Property[Seq[String]] = Empty,
    skewedColumnValues: Property[Seq[String]] = Empty,
    skewedColumnValueLocationMaps: Property[Json] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "SkewedColumnNames" -> skewedColumnNames,
    "SkewedColumnValues" -> skewedColumnValues,
    "SkewedColumnValueLocationMaps" -> skewedColumnValueLocationMaps
  )
}
