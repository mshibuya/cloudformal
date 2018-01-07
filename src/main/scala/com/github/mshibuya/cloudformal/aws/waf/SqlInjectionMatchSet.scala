package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html
 */

trait SqlInjectionMatchSet extends Resource {
  val resourceTypeName = "AWS::WAF::SqlInjectionMatchSet"

  def name: NonEmptyProperty[String]
  def sqlInjectionMatchTuples: Property[Seq[SqlInjectionMatchTuple]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Name" -> name,
    "SqlInjectionMatchTuples" -> sqlInjectionMatchTuples
  )
}
