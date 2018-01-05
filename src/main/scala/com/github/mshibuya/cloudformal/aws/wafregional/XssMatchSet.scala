package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html
 */

trait XssMatchSet extends Resource {
  val resourceTypeName = "AWS::WAFRegional::XssMatchSet"

  def xssMatchTuples: Option[Seq[XssMatchTuple]] = None
  def name: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "XssMatchTuples" -> xssMatchTuples.map(Formattable(_)),
    "Name" -> Some(Formattable(name))
  )
}
