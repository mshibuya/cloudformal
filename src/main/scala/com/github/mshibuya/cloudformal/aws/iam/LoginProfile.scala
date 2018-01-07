package com.github.mshibuya.cloudformal.aws.iam

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html
 */

case class LoginProfile(
    password: NonEmptyProperty[String],
    passwordResetRequired: Property[Boolean] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Password" -> password,
    "PasswordResetRequired" -> passwordResetRequired
  )
}
