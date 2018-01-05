package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html
 */

case class AdminCreateUserConfig(
    inviteMessageTemplate: Option[InviteMessageTemplate] = None,
    unusedAccountValidityDays: Option[Double] = None,
    allowAdminCreateUserOnly: Option[Boolean] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "InviteMessageTemplate" -> inviteMessageTemplate.map(Formattable(_)),
    "UnusedAccountValidityDays" -> unusedAccountValidityDays.map(Formattable(_)),
    "AllowAdminCreateUserOnly" -> allowAdminCreateUserOnly.map(Formattable(_))
  )
}
