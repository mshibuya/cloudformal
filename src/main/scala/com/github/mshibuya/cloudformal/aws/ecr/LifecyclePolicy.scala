package com.github.mshibuya.cloudformal.aws.ecr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html
 */

case class LifecyclePolicy(
    lifecyclePolicyText: Property[String] = Empty,
    registryId: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "LifecyclePolicyText" -> lifecyclePolicyText,
    "RegistryId" -> registryId
  )
}
