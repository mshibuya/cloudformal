package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html
 */

trait ByteMatchSet extends Resource[ByteMatchSet] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::WAF::ByteMatchSet"

  def byteMatchTuples: Property[Seq[ByteMatchTuple]] = Empty
  def name: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "ByteMatchTuples" -> byteMatchTuples,
    "Name" -> name
  )
}
