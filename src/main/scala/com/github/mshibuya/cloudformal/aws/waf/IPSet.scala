package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html
 */

trait IPSet extends Resource[IPSet] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::WAF::IPSet"

  def ipSetDescriptors: Property[Seq[IPSetDescriptor]] = Empty
  def name: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "IPSetDescriptors" -> ipSetDescriptors,
    "Name" -> name
  )
}
