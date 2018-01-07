package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html
 */

trait ByteMatchSet extends Resource {
  val resourceTypeName = "AWS::WAF::ByteMatchSet"

  def byteMatchTuples: Property[Seq[ByteMatchTuple]] = Empty
  def name: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ByteMatchTuples" -> byteMatchTuples,
    "Name" -> name
  )
}
