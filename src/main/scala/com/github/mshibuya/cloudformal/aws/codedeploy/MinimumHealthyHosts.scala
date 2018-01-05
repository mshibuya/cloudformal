package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html
 */

case class MinimumHealthyHosts(
    `type`: String,
    value: Int) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Type" -> Some(Formattable(`type`)),
    "Value" -> Some(Formattable(value))
  )
}
