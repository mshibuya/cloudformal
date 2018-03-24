package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html
 */

case class AdminCreateUserConfig(
    inviteMessageTemplate: Property[InviteMessageTemplate] = Empty,
    unusedAccountValidityDays: Property[Double] = Empty,
    allowAdminCreateUserOnly: Property[Boolean] = Empty) extends Expression[AdminCreateUserConfig] {
  def render: Formattable = Value(
    "InviteMessageTemplate" -> inviteMessageTemplate,
    "UnusedAccountValidityDays" -> unusedAccountValidityDays,
    "AllowAdminCreateUserOnly" -> allowAdminCreateUserOnly
  )
}
