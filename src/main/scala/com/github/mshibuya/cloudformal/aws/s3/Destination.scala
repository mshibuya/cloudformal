package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html
 */

case class Destination(
    bucketAccountId: Property[String] = Empty,
    bucketArn: NonEmptyProperty[String],
    format: NonEmptyProperty[String],
    prefix: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "BucketAccountId" -> bucketAccountId,
    "BucketArn" -> bucketArn,
    "Format" -> format,
    "Prefix" -> prefix
  )
}
