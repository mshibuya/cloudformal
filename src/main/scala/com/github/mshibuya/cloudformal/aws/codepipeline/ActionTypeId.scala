package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html
 */

case class ActionTypeId(
    category: String,
    owner: String,
    provider: String,
    version: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Category" -> Some(Formattable(category)),
    "Owner" -> Some(Formattable(owner)),
    "Provider" -> Some(Formattable(provider)),
    "Version" -> Some(Formattable(version))
  )
}
