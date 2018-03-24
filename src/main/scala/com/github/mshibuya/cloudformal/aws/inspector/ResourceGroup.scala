package com.github.mshibuya.cloudformal.aws.inspector

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html
 */

trait ResourceGroup extends Resource[ResourceGroup] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Inspector::ResourceGroup"

  object attributes {
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def resourceGroupTags: NonEmptyProperty[Seq[Tag]]

  def render(): MapValue[_] = Value(
    "ResourceGroupTags" -> resourceGroupTags
  )
}
