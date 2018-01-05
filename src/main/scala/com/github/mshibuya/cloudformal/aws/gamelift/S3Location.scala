package com.github.mshibuya.cloudformal.aws.gamelift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html
 */

case class S3Location(
    bucket: String,
    key: String,
    roleArn: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Bucket" -> Some(Formattable(bucket)),
    "Key" -> Some(Formattable(key)),
    "RoleArn" -> Some(Formattable(roleArn))
  )
}
