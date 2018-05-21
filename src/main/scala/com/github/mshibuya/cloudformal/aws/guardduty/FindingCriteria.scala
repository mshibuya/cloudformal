package com.github.mshibuya.cloudformal.aws.guardduty

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html
 */

case class FindingCriteria(
    criterion: Property[Json] = Empty,
    itemType: Property[Condition] = Empty) extends Expression[FindingCriteria] {
  def render: Formattable = Value(
    "Criterion" -> criterion,
    "ItemType" -> itemType
  )
}
