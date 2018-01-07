package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-elbinfo.html
 */

case class ELBInfo(
    name: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Name" -> name
  )
}
