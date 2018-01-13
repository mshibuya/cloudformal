package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html
 */

trait Listener extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ElasticLoadBalancingV2::Listener"

  def certificates: Property[Seq[Certificate]] = Empty
  def defaultActions: NonEmptyProperty[Seq[Action]]
  def loadBalancerArn: NonEmptyProperty[String]
  def port: NonEmptyProperty[Int]
  def protocol: NonEmptyProperty[String]
  def sslPolicy: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Certificates" -> certificates,
    "DefaultActions" -> defaultActions,
    "LoadBalancerArn" -> loadBalancerArn,
    "Port" -> port,
    "Protocol" -> protocol,
    "SslPolicy" -> sslPolicy
  )
}
