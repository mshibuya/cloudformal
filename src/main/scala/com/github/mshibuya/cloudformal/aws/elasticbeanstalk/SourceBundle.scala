package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html
 */

case class SourceBundle(
    s3Bucket: String,
    s3Key: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "S3Bucket" -> Some(Formattable(s3Bucket)),
    "S3Key" -> Some(Formattable(s3Key))
  )
}
