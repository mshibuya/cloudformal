package com.github.mshibuya.cloudformal.aws.redshift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html
 */

case class LoggingProperties(
    bucketName: NonEmptyProperty[String],
    s3KeyPrefix: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "BucketName" -> bucketName,
    "S3KeyPrefix" -> s3KeyPrefix
  )
}
