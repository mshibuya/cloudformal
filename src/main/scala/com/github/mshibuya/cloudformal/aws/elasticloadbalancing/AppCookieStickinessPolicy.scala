package com.github.mshibuya.cloudformal.aws.elasticloadbalancing

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-AppCookieStickinessPolicy.html
 */

case class AppCookieStickinessPolicy(
    cookieName: String,
    policyName: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "CookieName" -> Some(Formattable(cookieName)),
    "PolicyName" -> Some(Formattable(policyName))
  )
}
