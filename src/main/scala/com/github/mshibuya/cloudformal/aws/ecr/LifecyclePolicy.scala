package com.github.mshibuya.cloudformal.aws.ecr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html
 */

case class LifecyclePolicy(
    lifecyclePolicyText: Option[String] = None,
    registryId: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "LifecyclePolicyText" -> lifecyclePolicyText.map(Formattable(_)),
    "RegistryId" -> registryId.map(Formattable(_))
  )
}
