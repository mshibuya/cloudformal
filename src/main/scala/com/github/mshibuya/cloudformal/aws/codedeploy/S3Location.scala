package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html
 */

case class S3Location(
    bucket: String,
    bundleType: Option[String] = None,
    eTag: Option[String] = None,
    key: String,
    version: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Bucket" -> Some(Formattable(bucket)),
    "BundleType" -> bundleType.map(Formattable(_)),
    "ETag" -> eTag.map(Formattable(_)),
    "Key" -> Some(Formattable(key)),
    "Version" -> version.map(Formattable(_))
  )
}
