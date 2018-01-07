package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html
 */

trait IPSet extends Resource {
  val resourceTypeName = "AWS::WAF::IPSet"

  def iPSetDescriptors: Property[Seq[IPSetDescriptor]] = Empty
  def name: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "IPSetDescriptors" -> iPSetDescriptors,
    "Name" -> name
  )
}
