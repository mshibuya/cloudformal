package com.github.mshibuya.cloudformal.aws.cognito

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html
 */

trait IdentityPoolRoleAttachment extends Resource {
  val resourceTypeName = "AWS::Cognito::IdentityPoolRoleAttachment"

  def roleMappings: Option[Json] = None
  def identityPoolId: String
  def roles: Option[Json] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "RoleMappings" -> roleMappings.map(Formattable(_)),
    "IdentityPoolId" -> Some(Formattable(identityPoolId)),
    "Roles" -> roles.map(Formattable(_))
  )
}
