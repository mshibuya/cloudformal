package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html
 */

case class CorsRule(
    allowedHeaders: Option[Seq[String]] = None,
    allowedMethods: Seq[String],
    allowedOrigins: Seq[String],
    exposedHeaders: Option[Seq[String]] = None,
    id: Option[String] = None,
    maxAge: Option[Int] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AllowedHeaders" -> allowedHeaders.map(Formattable(_)),
    "AllowedMethods" -> Some(Formattable(allowedMethods)),
    "AllowedOrigins" -> Some(Formattable(allowedOrigins)),
    "ExposedHeaders" -> exposedHeaders.map(Formattable(_)),
    "Id" -> id.map(Formattable(_)),
    "MaxAge" -> maxAge.map(Formattable(_))
  )
}
