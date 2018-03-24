package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html
 */

case class AccessControlTranslation(
    owner: NonEmptyProperty[String]) extends Expression[AccessControlTranslation] {
  def render: Formattable = Value(
    "Owner" -> owner
  )
}
