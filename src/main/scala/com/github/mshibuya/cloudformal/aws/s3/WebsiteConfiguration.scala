package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html
 */

case class WebsiteConfiguration(
    errorDocument: Option[String] = None,
    indexDocument: Option[String] = None,
    redirectAllRequestsTo: Option[RedirectAllRequestsTo] = None,
    routingRules: Option[Seq[RoutingRule]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ErrorDocument" -> errorDocument.map(Formattable(_)),
    "IndexDocument" -> indexDocument.map(Formattable(_)),
    "RedirectAllRequestsTo" -> redirectAllRequestsTo.map(Formattable(_)),
    "RoutingRules" -> routingRules.map(Formattable(_))
  )
}
