package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html
 */

case class SourceBundle(
    s3Bucket: NonEmptyProperty[String],
    s3Key: NonEmptyProperty[String]) extends Expression[SourceBundle] {
  def render: Formattable = Value(
    "S3Bucket" -> s3Bucket,
    "S3Key" -> s3Key
  )
}
