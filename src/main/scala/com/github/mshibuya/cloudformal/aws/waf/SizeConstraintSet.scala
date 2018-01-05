package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html
 */

trait SizeConstraintSet extends Resource {
  val resourceTypeName = "AWS::WAF::SizeConstraintSet"

  def name: String
  def sizeConstraints: Seq[SizeConstraint]

  def resourceProperties: FormattableMap = Formattable.opt(
    "Name" -> Some(Formattable(name)),
    "SizeConstraints" -> Some(Formattable(sizeConstraints))
  )
}
