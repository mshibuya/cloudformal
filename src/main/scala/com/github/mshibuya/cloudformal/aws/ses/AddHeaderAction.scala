package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html
 */

case class AddHeaderAction(
    headerValue: NonEmptyProperty[String],
    headerName: NonEmptyProperty[String]) extends Expression[AddHeaderAction] {
  def render: Formattable = Value(
    "HeaderValue" -> headerValue,
    "HeaderName" -> headerName
  )
}
