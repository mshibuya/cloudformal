package com.github.mshibuya.cloudformal.aws.s3

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html
 */

trait BucketPolicy extends Resource[BucketPolicy] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::S3::BucketPolicy"

  def bucket: NonEmptyProperty[String]
  def policyDocument: NonEmptyProperty[Json]

  def render(): MapValue[_] = Value(
    "Bucket" -> bucket,
    "PolicyDocument" -> policyDocument
  )
}
