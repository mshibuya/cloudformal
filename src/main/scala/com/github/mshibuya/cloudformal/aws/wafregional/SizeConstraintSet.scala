package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html
 */

trait SizeConstraintSet extends Resource {
  val resourceTypeName = "AWS::WAFRegional::SizeConstraintSet"

  def sizeConstraints: Property[Seq[SizeConstraint]] = Empty
  def name: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "SizeConstraints" -> sizeConstraints,
    "Name" -> name
  )
}
