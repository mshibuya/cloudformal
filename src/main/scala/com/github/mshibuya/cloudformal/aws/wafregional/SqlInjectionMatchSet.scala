package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html
 */

trait SqlInjectionMatchSet extends Resource {
  val resourceTypeName = "AWS::WAFRegional::SqlInjectionMatchSet"

  def sqlInjectionMatchTuples: Option[Seq[SqlInjectionMatchTuple]] = None
  def name: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "SqlInjectionMatchTuples" -> sqlInjectionMatchTuples.map(Formattable(_)),
    "Name" -> Some(Formattable(name))
  )
}
