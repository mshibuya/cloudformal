package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html
 */

case class ReplicationDestination(
    bucket: String,
    storageClass: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Bucket" -> Some(Formattable(bucket)),
    "StorageClass" -> storageClass.map(Formattable(_))
  )
}
