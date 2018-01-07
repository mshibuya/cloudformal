package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html
 */

case class CustomErrorResponse(
    responseCode: Property[Int] = Empty,
    errorCachingMinTTL: Property[Double] = Empty,
    errorCode: NonEmptyProperty[Int],
    responsePagePath: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ResponseCode" -> responseCode,
    "ErrorCachingMinTTL" -> errorCachingMinTTL,
    "ErrorCode" -> errorCode,
    "ResponsePagePath" -> responsePagePath
  )
}
