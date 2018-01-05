package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html
 */

case class TracingConfig(
    mode: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Mode" -> mode.map(Formattable(_))
  )
}
