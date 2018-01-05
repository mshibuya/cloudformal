package com.github.mshibuya.cloudformal.aws.elasticloadbalancing

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html
 */

case class AccessLoggingPolicy(
    emitInterval: Option[Int] = None,
    enabled: Boolean,
    s3BucketName: String,
    s3BucketPrefix: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "EmitInterval" -> emitInterval.map(Formattable(_)),
    "Enabled" -> Some(Formattable(enabled)),
    "S3BucketName" -> Some(Formattable(s3BucketName)),
    "S3BucketPrefix" -> s3BucketPrefix.map(Formattable(_))
  )
}
