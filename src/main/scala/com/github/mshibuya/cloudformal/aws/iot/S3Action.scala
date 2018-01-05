package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html
 */

case class S3Action(
    bucketName: String,
    key: String,
    roleArn: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "BucketName" -> Some(Formattable(bucketName)),
    "Key" -> Some(Formattable(key)),
    "RoleArn" -> Some(Formattable(roleArn))
  )
}
