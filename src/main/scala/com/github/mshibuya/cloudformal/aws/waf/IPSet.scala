package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html
 */

trait IPSet extends Resource {
  val resourceTypeName = "AWS::WAF::IPSet"

  def iPSetDescriptors: Option[Seq[IPSetDescriptor]] = None
  def name: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "IPSetDescriptors" -> iPSetDescriptors.map(Formattable(_)),
    "Name" -> Some(Formattable(name))
  )
}
