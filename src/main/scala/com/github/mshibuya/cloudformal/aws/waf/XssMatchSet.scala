package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html
 */

trait XssMatchSet extends Resource {
  val resourceTypeName = "AWS::WAF::XssMatchSet"

  def name: NonEmptyProperty[String]
  def xssMatchTuples: NonEmptyProperty[Seq[XssMatchTuple]]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Name" -> name,
    "XssMatchTuples" -> xssMatchTuples
  )
}
