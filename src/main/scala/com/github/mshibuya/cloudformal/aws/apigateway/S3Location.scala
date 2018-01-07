package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html
 */

case class S3Location(
    bucket: Property[String] = Empty,
    eTag: Property[String] = Empty,
    key: Property[String] = Empty,
    version: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Bucket" -> bucket,
    "ETag" -> eTag,
    "Key" -> key,
    "Version" -> version
  )
}
