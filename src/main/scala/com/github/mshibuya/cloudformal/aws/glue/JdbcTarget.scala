package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html
 */

case class JdbcTarget(
    connectionName: Option[String] = None,
    path: Option[String] = None,
    exclusions: Option[Seq[String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ConnectionName" -> connectionName.map(Formattable(_)),
    "Path" -> path.map(Formattable(_)),
    "Exclusions" -> exclusions.map(Formattable(_))
  )
}
