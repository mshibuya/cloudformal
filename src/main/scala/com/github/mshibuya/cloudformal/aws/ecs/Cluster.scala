package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html
 */

trait Cluster extends Resource {
  val resourceTypeName = "AWS::ECS::Cluster"

  def clusterName: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "ClusterName" -> clusterName.map(Formattable(_))
  )
}
