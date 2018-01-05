package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html
 */

case class S3ReferenceDataSource(
    bucketARN: String,
    fileKey: String,
    referenceRoleARN: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "BucketARN" -> Some(Formattable(bucketARN)),
    "FileKey" -> Some(Formattable(fileKey)),
    "ReferenceRoleARN" -> Some(Formattable(referenceRoleARN))
  )
}
