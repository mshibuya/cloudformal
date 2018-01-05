package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html
 */

case class Environment(
    variables: Option[ListMap[String, String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Variables" -> variables.map(Formattable(_))
  )
}
