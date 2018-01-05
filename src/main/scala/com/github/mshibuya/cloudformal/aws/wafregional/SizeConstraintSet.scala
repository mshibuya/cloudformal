package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html
 */

trait SizeConstraintSet extends Resource {
  val resourceTypeName = "AWS::WAFRegional::SizeConstraintSet"

  def sizeConstraints: Option[Seq[SizeConstraint]] = None
  def name: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "SizeConstraints" -> sizeConstraints.map(Formattable(_)),
    "Name" -> Some(Formattable(name))
  )
}
