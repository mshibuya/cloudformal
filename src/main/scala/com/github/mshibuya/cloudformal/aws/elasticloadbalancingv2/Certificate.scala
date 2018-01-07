package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-certificates.html
 */

case class Certificate(
    certificateArn: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "CertificateArn" -> certificateArn
  )
}
