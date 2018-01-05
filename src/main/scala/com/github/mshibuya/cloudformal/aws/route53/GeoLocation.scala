package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html
 */

case class GeoLocation(
    continentCode: Option[String] = None,
    countryCode: Option[String] = None,
    subdivisionCode: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ContinentCode" -> continentCode.map(Formattable(_)),
    "CountryCode" -> countryCode.map(Formattable(_)),
    "SubdivisionCode" -> subdivisionCode.map(Formattable(_))
  )
}
