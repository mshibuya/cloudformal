package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html
 */

case class CustomErrorResponse(
    responseCode: Option[Int] = None,
    errorCachingMinTTL: Option[Double] = None,
    errorCode: Int,
    responsePagePath: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ResponseCode" -> responseCode.map(Formattable(_)),
    "ErrorCachingMinTTL" -> errorCachingMinTTL.map(Formattable(_)),
    "ErrorCode" -> Some(Formattable(errorCode)),
    "ResponsePagePath" -> responsePagePath.map(Formattable(_))
  )
}
