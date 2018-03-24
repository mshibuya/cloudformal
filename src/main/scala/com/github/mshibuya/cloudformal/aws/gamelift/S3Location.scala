package com.github.mshibuya.cloudformal.aws.gamelift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html
 */

case class S3Location(
    bucket: NonEmptyProperty[String],
    key: NonEmptyProperty[String],
    roleArn: NonEmptyProperty[String]) extends Expression[S3Location] {
  def render: Formattable = Value(
    "Bucket" -> bucket,
    "Key" -> key,
    "RoleArn" -> roleArn
  )
}
