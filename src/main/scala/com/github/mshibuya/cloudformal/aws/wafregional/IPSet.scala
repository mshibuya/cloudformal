package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html
 */

trait IPSet extends Resource {
  val resourceTypeName = "AWS::WAFRegional::IPSet"

  def iPSetDescriptors: Property[Seq[IPSetDescriptor]] = Empty
  def name: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "IPSetDescriptors" -> iPSetDescriptors,
    "Name" -> name
  )
}
