package com.github.mshibuya.cloudformal.aws.iam

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html
 */

case class LoginProfile(
    password: String,
    passwordResetRequired: Option[Boolean] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Password" -> Some(Formattable(password)),
    "PasswordResetRequired" -> passwordResetRequired.map(Formattable(_))
  )
}
