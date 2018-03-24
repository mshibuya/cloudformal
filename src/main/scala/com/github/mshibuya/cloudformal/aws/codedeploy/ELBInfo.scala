package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-elbinfo.html
 */

case class ELBInfo(
    name: Property[String] = Empty) extends Expression[ELBInfo] {
  def render: Formattable = Value(
    "Name" -> name
  )
}
