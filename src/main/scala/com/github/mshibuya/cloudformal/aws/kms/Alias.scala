package com.github.mshibuya.cloudformal.aws.kms

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html
 */

trait Alias extends Resource[Alias] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::KMS::Alias"

  def aliasName: NonEmptyProperty[String]
  def targetKeyId: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "AliasName" -> aliasName,
    "TargetKeyId" -> targetKeyId
  )
}
