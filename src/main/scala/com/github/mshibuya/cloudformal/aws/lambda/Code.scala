package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html
 */

case class Code(
    s3Bucket: Property[String] = Empty,
    s3Key: Property[String] = Empty,
    s3ObjectVersion: Property[String] = Empty,
    zipFile: Property[String] = Empty) extends Expression[Code] {
  def render: Formattable = Value(
    "S3Bucket" -> s3Bucket,
    "S3Key" -> s3Key,
    "S3ObjectVersion" -> s3ObjectVersion,
    "ZipFile" -> zipFile
  )
}
