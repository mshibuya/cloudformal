package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html
 */

case class S3Target(
    path: Property[String] = Empty,
    exclusions: Property[Seq[String]] = Empty) extends Expression[S3Target] {
  def render: Formattable = Value(
    "Path" -> path,
    "Exclusions" -> exclusions
  )
}
