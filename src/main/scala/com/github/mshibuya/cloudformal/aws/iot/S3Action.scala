package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html
 */

case class S3Action(
    bucketName: NonEmptyProperty[String],
    key: NonEmptyProperty[String],
    roleArn: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "BucketName" -> bucketName,
    "Key" -> key,
    "RoleArn" -> roleArn
  )
}
