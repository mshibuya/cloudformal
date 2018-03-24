package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html
 */

trait Cluster extends Resource[Cluster] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ECS::Cluster"

  object attributes {
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def clusterName: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "ClusterName" -> clusterName
  )
}
