package com.github.mshibuya.cloudformal.aws.s3

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html
 */

trait BucketPolicy extends Resource {
  val resourceTypeName = "AWS::S3::BucketPolicy"

  def bucket: String
  def policyDocument: Json

  def resourceProperties: FormattableMap = Formattable.opt(
    "Bucket" -> Some(Formattable(bucket)),
    "PolicyDocument" -> Some(Formattable(policyDocument))
  )
}
