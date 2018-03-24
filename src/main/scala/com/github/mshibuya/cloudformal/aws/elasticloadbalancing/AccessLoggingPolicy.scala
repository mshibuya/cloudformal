package com.github.mshibuya.cloudformal.aws.elasticloadbalancing

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html
 */

case class AccessLoggingPolicy(
    emitInterval: Property[Int] = Empty,
    enabled: NonEmptyProperty[Boolean],
    s3BucketName: NonEmptyProperty[String],
    s3BucketPrefix: Property[String] = Empty) extends Expression[AccessLoggingPolicy] {
  def render: Formattable = Value(
    "EmitInterval" -> emitInterval,
    "Enabled" -> enabled,
    "S3BucketName" -> s3BucketName,
    "S3BucketPrefix" -> s3BucketPrefix
  )
}
