package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html
 */

trait IPSet extends Resource {
  val resourceTypeName = "AWS::WAFRegional::IPSet"

  def iPSetDescriptors: Option[Seq[IPSetDescriptor]] = None
  def name: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "IPSetDescriptors" -> iPSetDescriptors.map(Formattable(_)),
    "Name" -> Some(Formattable(name))
  )
}
