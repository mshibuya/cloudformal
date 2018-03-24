package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html
 */

trait SqlInjectionMatchSet extends Resource[SqlInjectionMatchSet] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::WAF::SqlInjectionMatchSet"

  def name: NonEmptyProperty[String]
  def sqlInjectionMatchTuples: Property[Seq[SqlInjectionMatchTuple]] = Empty

  def render(): MapValue[_] = Value(
    "Name" -> name,
    "SqlInjectionMatchTuples" -> sqlInjectionMatchTuples
  )
}
