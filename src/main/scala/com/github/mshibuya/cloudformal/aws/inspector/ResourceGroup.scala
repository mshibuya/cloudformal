package com.github.mshibuya.cloudformal.aws.inspector

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html
 */

trait ResourceGroup extends Resource {
  val resourceTypeName = "AWS::Inspector::ResourceGroup"

  def resourceGroupTags: Seq[Tag]

  def resourceProperties: FormattableMap = Formattable.opt(
    "ResourceGroupTags" -> Some(Formattable(resourceGroupTags))
  )
}
