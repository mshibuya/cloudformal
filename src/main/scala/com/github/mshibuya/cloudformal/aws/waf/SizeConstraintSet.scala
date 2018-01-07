package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html
 */

trait SizeConstraintSet extends Resource {
  val resourceTypeName = "AWS::WAF::SizeConstraintSet"

  def name: NonEmptyProperty[String]
  def sizeConstraints: NonEmptyProperty[Seq[SizeConstraint]]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Name" -> name,
    "SizeConstraints" -> sizeConstraints
  )
}
