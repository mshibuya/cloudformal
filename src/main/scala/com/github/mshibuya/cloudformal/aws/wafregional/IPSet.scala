package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html
 */

trait IPSet extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::WAFRegional::IPSet"

  def ipSetDescriptors: Property[Seq[IPSetDescriptor]] = Empty
  def name: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "IPSetDescriptors" -> ipSetDescriptors,
    "Name" -> name
  )
}
