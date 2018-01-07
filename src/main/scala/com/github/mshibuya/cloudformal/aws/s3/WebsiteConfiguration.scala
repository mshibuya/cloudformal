package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html
 */

case class WebsiteConfiguration(
    errorDocument: Property[String] = Empty,
    indexDocument: Property[String] = Empty,
    redirectAllRequestsTo: Property[RedirectAllRequestsTo] = Empty,
    routingRules: Property[Seq[RoutingRule]] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ErrorDocument" -> errorDocument,
    "IndexDocument" -> indexDocument,
    "RedirectAllRequestsTo" -> redirectAllRequestsTo,
    "RoutingRules" -> routingRules
  )
}
