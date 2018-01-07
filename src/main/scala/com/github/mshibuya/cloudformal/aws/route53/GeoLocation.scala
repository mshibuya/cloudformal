package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html
 */

case class GeoLocation(
    continentCode: Property[String] = Empty,
    countryCode: Property[String] = Empty,
    subdivisionCode: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ContinentCode" -> continentCode,
    "CountryCode" -> countryCode,
    "SubdivisionCode" -> subdivisionCode
  )
}
