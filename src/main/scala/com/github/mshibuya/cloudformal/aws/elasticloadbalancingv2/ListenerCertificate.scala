package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html
 */

trait ListenerCertificate extends Resource {
  val resourceTypeName = "AWS::ElasticLoadBalancingV2::ListenerCertificate"

  def certificates: Seq[Certificate]
  def listenerArn: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "Certificates" -> Some(Formattable(certificates)),
    "ListenerArn" -> Some(Formattable(listenerArn))
  )
}
