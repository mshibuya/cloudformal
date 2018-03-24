package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html
 */

trait Template extends Resource[Template] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::SES::Template"

  def template: Property[Template] = Empty

  def render(): MapValue[_] = Value(
    "Template" -> template
  )
}
