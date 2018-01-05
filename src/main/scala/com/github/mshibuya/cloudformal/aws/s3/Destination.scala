package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html
 */

case class Destination(
    bucketAccountId: Option[String] = None,
    bucketArn: String,
    format: String,
    prefix: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "BucketAccountId" -> bucketAccountId.map(Formattable(_)),
    "BucketArn" -> Some(Formattable(bucketArn)),
    "Format" -> Some(Formattable(format)),
    "Prefix" -> prefix.map(Formattable(_))
  )
}
