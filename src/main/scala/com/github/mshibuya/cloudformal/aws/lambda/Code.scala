package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html
 */

case class Code(
    s3Bucket: Option[String] = None,
    s3Key: Option[String] = None,
    s3ObjectVersion: Option[String] = None,
    zipFile: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "S3Bucket" -> s3Bucket.map(Formattable(_)),
    "S3Key" -> s3Key.map(Formattable(_)),
    "S3ObjectVersion" -> s3ObjectVersion.map(Formattable(_)),
    "ZipFile" -> zipFile.map(Formattable(_))
  )
}
