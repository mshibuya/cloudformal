package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html
 */

case class PasswordPolicy(
    requireNumbers: Option[Boolean] = None,
    minimumLength: Option[Int] = None,
    requireUppercase: Option[Boolean] = None,
    requireLowercase: Option[Boolean] = None,
    requireSymbols: Option[Boolean] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "RequireNumbers" -> requireNumbers.map(Formattable(_)),
    "MinimumLength" -> minimumLength.map(Formattable(_)),
    "RequireUppercase" -> requireUppercase.map(Formattable(_)),
    "RequireLowercase" -> requireLowercase.map(Formattable(_)),
    "RequireSymbols" -> requireSymbols.map(Formattable(_))
  )
}
