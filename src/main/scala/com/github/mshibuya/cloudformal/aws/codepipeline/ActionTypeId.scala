package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html
 */

case class ActionTypeId(
    category: NonEmptyProperty[String],
    owner: NonEmptyProperty[String],
    provider: NonEmptyProperty[String],
    version: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Category" -> category,
    "Owner" -> owner,
    "Provider" -> provider,
    "Version" -> version
  )
}
