package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html
 */

trait ListenerCertificate extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ElasticLoadBalancingV2::ListenerCertificate"

  def certificates: NonEmptyProperty[Seq[Certificate]]
  def listenerArn: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Certificates" -> certificates,
    "ListenerArn" -> listenerArn
  )
}
