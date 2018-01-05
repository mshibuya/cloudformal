package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-certificates.html
 */

case class Certificate(
    certificateArn: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "CertificateArn" -> certificateArn.map(Formattable(_))
  )
}
