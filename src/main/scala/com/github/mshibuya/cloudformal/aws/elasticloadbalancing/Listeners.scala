package com.github.mshibuya.cloudformal.aws.elasticloadbalancing

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html
 */

case class Listeners(
    instancePort: NonEmptyProperty[String],
    instanceProtocol: Property[String] = Empty,
    loadBalancerPort: NonEmptyProperty[String],
    policyNames: Property[Seq[String]] = Empty,
    protocol: NonEmptyProperty[String],
    sslCertificateId: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "InstancePort" -> instancePort,
    "InstanceProtocol" -> instanceProtocol,
    "LoadBalancerPort" -> loadBalancerPort,
    "PolicyNames" -> policyNames,
    "Protocol" -> protocol,
    "SSLCertificateId" -> sslCertificateId
  )
}
