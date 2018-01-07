package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html
 */

case class PasswordPolicy(
    requireNumbers: Property[Boolean] = Empty,
    minimumLength: Property[Int] = Empty,
    requireUppercase: Property[Boolean] = Empty,
    requireLowercase: Property[Boolean] = Empty,
    requireSymbols: Property[Boolean] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "RequireNumbers" -> requireNumbers,
    "MinimumLength" -> minimumLength,
    "RequireUppercase" -> requireUppercase,
    "RequireLowercase" -> requireLowercase,
    "RequireSymbols" -> requireSymbols
  )
}
