package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html
 */

case class JdbcTarget(
    connectionName: Property[String] = Empty,
    path: Property[String] = Empty,
    exclusions: Property[Seq[String]] = Empty) extends Expression[JdbcTarget] {
  def render: Formattable = Value(
    "ConnectionName" -> connectionName,
    "Path" -> path,
    "Exclusions" -> exclusions
  )
}
