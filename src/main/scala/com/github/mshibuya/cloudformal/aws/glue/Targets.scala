package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html
 */

case class Targets(
    s3Targets: Property[Seq[S3Target]] = Empty,
    jdbcTargets: Property[Seq[JdbcTarget]] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "S3Targets" -> s3Targets,
    "JdbcTargets" -> jdbcTargets
  )
}
