package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html
 */

trait WebACLAssociation extends Resource[WebACLAssociation] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::WAFRegional::WebACLAssociation"

  def resourceArn: NonEmptyProperty[String]
  def webACLId: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "ResourceArn" -> resourceArn,
    "WebACLId" -> webACLId
  )
}
