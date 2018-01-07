package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html
 */

case class Restrictions(
    geoRestriction: NonEmptyProperty[GeoRestriction]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "GeoRestriction" -> geoRestriction
  )
}
