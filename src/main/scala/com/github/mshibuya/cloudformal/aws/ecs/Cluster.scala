package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html
 */

trait Cluster extends Resource {
  val resourceTypeName = "AWS::ECS::Cluster"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def clusterName: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ClusterName" -> clusterName
  )
}
