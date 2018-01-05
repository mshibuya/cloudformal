package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters.html
 */

case class TagFilter(
    key: Option[String] = None,
    `type`: Option[String] = None,
    value: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Key" -> key.map(Formattable(_)),
    "Type" -> `type`.map(Formattable(_)),
    "Value" -> value.map(Formattable(_))
  )
}
