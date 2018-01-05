package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html
 */

trait SqlInjectionMatchSet extends Resource {
  val resourceTypeName = "AWS::WAF::SqlInjectionMatchSet"

  def name: String
  def sqlInjectionMatchTuples: Option[Seq[SqlInjectionMatchTuple]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Name" -> Some(Formattable(name)),
    "SqlInjectionMatchTuples" -> sqlInjectionMatchTuples.map(Formattable(_))
  )
}
