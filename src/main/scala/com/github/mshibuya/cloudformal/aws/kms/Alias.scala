package com.github.mshibuya.cloudformal.aws.kms

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html
 */

trait Alias extends Resource {
  val resourceTypeName = "AWS::KMS::Alias"

  def aliasName: NonEmptyProperty[String]
  def targetKeyId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AliasName" -> aliasName,
    "TargetKeyId" -> targetKeyId
  )
}
