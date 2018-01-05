package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html
 */

trait XssMatchSet extends Resource {
  val resourceTypeName = "AWS::WAF::XssMatchSet"

  def name: String
  def xssMatchTuples: Seq[XssMatchTuple]

  def resourceProperties: FormattableMap = Formattable.opt(
    "Name" -> Some(Formattable(name)),
    "XssMatchTuples" -> Some(Formattable(xssMatchTuples))
  )
}
