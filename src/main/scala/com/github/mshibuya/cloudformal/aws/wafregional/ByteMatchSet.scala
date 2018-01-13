package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html
 */

trait ByteMatchSet extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::WAFRegional::ByteMatchSet"

  def byteMatchTuples: Property[Seq[ByteMatchTuple]] = Empty
  def name: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ByteMatchTuples" -> byteMatchTuples,
    "Name" -> name
  )
}
