package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html
 */

case class TagSpecification(
    resourceType: Property[String] = Empty,
    tags: Property[Seq[Tag]] = Empty) extends Expression[TagSpecification] {
  def render: Formattable = Value(
    "ResourceType" -> resourceType,
    "Tags" -> tags
  )
}
