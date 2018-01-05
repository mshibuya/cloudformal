package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html
 */

case class GeoRestriction(
    locations: Option[Seq[String]] = None,
    restrictionType: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Locations" -> locations.map(Formattable(_)),
    "RestrictionType" -> Some(Formattable(restrictionType))
  )
}
