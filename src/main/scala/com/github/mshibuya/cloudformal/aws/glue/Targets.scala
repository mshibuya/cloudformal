package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html
 */

case class Targets(
    s3Targets: Option[Seq[S3Target]] = None,
    jdbcTargets: Option[Seq[JdbcTarget]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "S3Targets" -> s3Targets.map(Formattable(_)),
    "JdbcTargets" -> jdbcTargets.map(Formattable(_))
  )
}
