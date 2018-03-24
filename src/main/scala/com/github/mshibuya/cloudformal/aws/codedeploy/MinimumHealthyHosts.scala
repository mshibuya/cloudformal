package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html
 */

case class MinimumHealthyHosts(
    `type`: NonEmptyProperty[String],
    value: NonEmptyProperty[Int]) extends Expression[MinimumHealthyHosts] {
  def render: Formattable = Value(
    "Type" -> `type`,
    "Value" -> value
  )
}
