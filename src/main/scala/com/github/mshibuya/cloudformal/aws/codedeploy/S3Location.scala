package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html
 */

case class S3Location(
    bucket: NonEmptyProperty[String],
    bundleType: Property[String] = Empty,
    eTag: Property[String] = Empty,
    key: NonEmptyProperty[String],
    version: Property[String] = Empty) extends Expression[S3Location] {
  def render: Formattable = Value(
    "Bucket" -> bucket,
    "BundleType" -> bundleType,
    "ETag" -> eTag,
    "Key" -> key,
    "Version" -> version
  )
}
