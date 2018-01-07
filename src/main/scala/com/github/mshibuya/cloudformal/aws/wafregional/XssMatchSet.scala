package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html
 */

trait XssMatchSet extends Resource {
  val resourceTypeName = "AWS::WAFRegional::XssMatchSet"

  def xssMatchTuples: Property[Seq[XssMatchTuple]] = Empty
  def name: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "XssMatchTuples" -> xssMatchTuples,
    "Name" -> name
  )
}
