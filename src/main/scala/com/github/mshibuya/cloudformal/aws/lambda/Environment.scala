package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html
 */

case class Environment(
    variables: Property[ListMap[String, String]] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Variables" -> variables
  )
}
