package com.github.mshibuya.cloudformal.aws.redshift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html
 */

case class LoggingProperties(
    bucketName: String,
    s3KeyPrefix: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "BucketName" -> Some(Formattable(bucketName)),
    "S3KeyPrefix" -> s3KeyPrefix.map(Formattable(_))
  )
}
