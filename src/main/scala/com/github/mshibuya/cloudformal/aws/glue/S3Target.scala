package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html
 */

case class S3Target(
    path: Option[String] = None,
    exclusions: Option[Seq[String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Path" -> path.map(Formattable(_)),
    "Exclusions" -> exclusions.map(Formattable(_))
  )
}
