package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html
 */

case class S3ReferenceDataSource(
    bucketARN: NonEmptyProperty[String],
    fileKey: NonEmptyProperty[String],
    referenceRoleARN: NonEmptyProperty[String]) extends Expression[S3ReferenceDataSource] {
  def render: Formattable = Value(
    "BucketARN" -> bucketARN,
    "FileKey" -> fileKey,
    "ReferenceRoleARN" -> referenceRoleARN
  )
}
