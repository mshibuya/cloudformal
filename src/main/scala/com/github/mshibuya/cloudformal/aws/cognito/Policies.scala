package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html
 */

case class Policies(
    passwordPolicy: Option[PasswordPolicy] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "PasswordPolicy" -> passwordPolicy.map(Formattable(_))
  )
}
