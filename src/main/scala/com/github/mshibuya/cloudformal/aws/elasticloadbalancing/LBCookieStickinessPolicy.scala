package com.github.mshibuya.cloudformal.aws.elasticloadbalancing

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html
 */

case class LBCookieStickinessPolicy(
    cookieExpirationPeriod: Property[String] = Empty,
    policyName: Property[String] = Empty) extends Expression[LBCookieStickinessPolicy] {
  def render: Formattable = Value(
    "CookieExpirationPeriod" -> cookieExpirationPeriod,
    "PolicyName" -> policyName
  )
}
