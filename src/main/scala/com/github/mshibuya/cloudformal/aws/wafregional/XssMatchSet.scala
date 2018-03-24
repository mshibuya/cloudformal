package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html
 */

trait XssMatchSet extends Resource[XssMatchSet] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::WAFRegional::XssMatchSet"

  def xssMatchTuples: Property[Seq[XssMatchTuple]] = Empty
  def name: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "XssMatchTuples" -> xssMatchTuples,
    "Name" -> name
  )
}
