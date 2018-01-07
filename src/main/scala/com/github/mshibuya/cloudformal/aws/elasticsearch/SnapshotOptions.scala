package com.github.mshibuya.cloudformal.aws.elasticsearch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html
 */

case class SnapshotOptions(
    automatedSnapshotStartHour: Property[Int] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "AutomatedSnapshotStartHour" -> automatedSnapshotStartHour
  )
}
