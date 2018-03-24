package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html
 */

case class RedirectAllRequestsTo(
    hostName: NonEmptyProperty[String],
    protocol: Property[String] = Empty) extends Expression[RedirectAllRequestsTo] {
  def render: Formattable = Value(
    "HostName" -> hostName,
    "Protocol" -> protocol
  )
}
