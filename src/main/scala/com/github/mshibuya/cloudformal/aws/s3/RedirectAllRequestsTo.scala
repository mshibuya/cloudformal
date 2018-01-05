package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html
 */

case class RedirectAllRequestsTo(
    hostName: String,
    protocol: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "HostName" -> Some(Formattable(hostName)),
    "Protocol" -> protocol.map(Formattable(_))
  )
}
