package com.github.mshibuya.cloudformal.aws.cognito

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html
 */

trait IdentityPoolRoleAttachment extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Cognito::IdentityPoolRoleAttachment"

  def roleMappings: Property[Json] = Empty
  def identityPoolId: NonEmptyProperty[String]
  def roles: Property[Json] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "RoleMappings" -> roleMappings,
    "IdentityPoolId" -> identityPoolId,
    "Roles" -> roles
  )
}
