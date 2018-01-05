package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html
 */

trait Listener extends Resource {
  val resourceTypeName = "AWS::ElasticLoadBalancingV2::Listener"

  def certificates: Option[Seq[Certificate]] = None
  def defaultActions: Seq[Action]
  def loadBalancerArn: String
  def port: Int
  def protocol: String
  def sslPolicy: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Certificates" -> certificates.map(Formattable(_)),
    "DefaultActions" -> Some(Formattable(defaultActions)),
    "LoadBalancerArn" -> Some(Formattable(loadBalancerArn)),
    "Port" -> Some(Formattable(port)),
    "Protocol" -> Some(Formattable(protocol)),
    "SslPolicy" -> sslPolicy.map(Formattable(_))
  )
}
