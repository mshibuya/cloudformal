package com.github.mshibuya.cloudformal.aws.elasticloadbalancing

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html
 */

case class Listeners(
    instancePort: String,
    instanceProtocol: Option[String] = None,
    loadBalancerPort: String,
    policyNames: Option[Seq[String]] = None,
    protocol: String,
    sSLCertificateId: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "InstancePort" -> Some(Formattable(instancePort)),
    "InstanceProtocol" -> instanceProtocol.map(Formattable(_)),
    "LoadBalancerPort" -> Some(Formattable(loadBalancerPort)),
    "PolicyNames" -> policyNames.map(Formattable(_)),
    "Protocol" -> Some(Formattable(protocol)),
    "SSLCertificateId" -> sSLCertificateId.map(Formattable(_))
  )
}
