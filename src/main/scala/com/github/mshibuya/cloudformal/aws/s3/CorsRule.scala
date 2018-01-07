package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html
 */

case class CorsRule(
    allowedHeaders: Property[Seq[String]] = Empty,
    allowedMethods: NonEmptyProperty[Seq[String]],
    allowedOrigins: NonEmptyProperty[Seq[String]],
    exposedHeaders: Property[Seq[String]] = Empty,
    id: Property[String] = Empty,
    maxAge: Property[Int] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "AllowedHeaders" -> allowedHeaders,
    "AllowedMethods" -> allowedMethods,
    "AllowedOrigins" -> allowedOrigins,
    "ExposedHeaders" -> exposedHeaders,
    "Id" -> id,
    "MaxAge" -> maxAge
  )
}
