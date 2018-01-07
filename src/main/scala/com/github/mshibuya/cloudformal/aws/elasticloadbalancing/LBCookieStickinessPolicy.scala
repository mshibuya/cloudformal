package com.github.mshibuya.cloudformal.aws.elasticloadbalancing

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html
 */

case class LBCookieStickinessPolicy(
    cookieExpirationPeriod: Property[String] = Empty,
    policyName: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "CookieExpirationPeriod" -> cookieExpirationPeriod,
    "PolicyName" -> policyName
  )
}
