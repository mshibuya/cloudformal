package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html
 */

case class GeoRestriction(
    locations: Property[Seq[String]] = Empty,
    restrictionType: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Locations" -> locations,
    "RestrictionType" -> restrictionType
  )
}
