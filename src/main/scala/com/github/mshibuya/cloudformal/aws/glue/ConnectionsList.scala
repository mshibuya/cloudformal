package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html
 */

case class ConnectionsList(
    connections: Property[Seq[String]] = Empty) extends Expression[ConnectionsList] {
  def render: Formattable = Value(
    "Connections" -> connections
  )
}
