package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html
 */

trait ByteMatchSet extends Resource {
  val resourceTypeName = "AWS::WAFRegional::ByteMatchSet"

  def byteMatchTuples: Option[Seq[ByteMatchTuple]] = None
  def name: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "ByteMatchTuples" -> byteMatchTuples.map(Formattable(_)),
    "Name" -> Some(Formattable(name))
  )
}
