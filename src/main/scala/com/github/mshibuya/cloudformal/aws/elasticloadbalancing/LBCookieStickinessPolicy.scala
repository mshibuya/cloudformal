package com.github.mshibuya.cloudformal.aws.elasticloadbalancing

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html
 */

case class LBCookieStickinessPolicy(
    cookieExpirationPeriod: Option[String] = None,
    policyName: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "CookieExpirationPeriod" -> cookieExpirationPeriod.map(Formattable(_)),
    "PolicyName" -> policyName.map(Formattable(_))
  )
}
