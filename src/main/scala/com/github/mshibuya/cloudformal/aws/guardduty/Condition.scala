package com.github.mshibuya.cloudformal.aws.guardduty

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html
 */

case class Condition(
    lt: Property[Int] = Empty,
    gte: Property[Int] = Empty,
    neq: Property[Seq[String]] = Empty,
    eq: Property[Seq[String]] = Empty,
    lte: Property[Int] = Empty) extends Expression[Condition] {
  def render: Formattable = Value(
    "Lt" -> lt,
    "Gte" -> gte,
    "Neq" -> neq,
    "Eq" -> eq,
    "Lte" -> lte
  )
}
