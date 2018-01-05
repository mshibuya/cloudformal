package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html
 */

case class ConnectionsList(
    connections: Option[Seq[String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Connections" -> connections.map(Formattable(_))
  )
}
