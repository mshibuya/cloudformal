package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html
 */

case class S3Location(
    bucket: Option[String] = None,
    eTag: Option[String] = None,
    key: Option[String] = None,
    version: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Bucket" -> bucket.map(Formattable(_)),
    "ETag" -> eTag.map(Formattable(_)),
    "Key" -> key.map(Formattable(_)),
    "Version" -> version.map(Formattable(_))
  )
}
