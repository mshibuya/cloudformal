package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html
 */

case class LambdaConfig(
    createAuthChallenge: Property[String] = Empty,
    preAuthentication: Property[String] = Empty,
    defineAuthChallenge: Property[String] = Empty,
    preSignUp: Property[String] = Empty,
    postAuthentication: Property[String] = Empty,
    postConfirmation: Property[String] = Empty,
    customMessage: Property[String] = Empty,
    verifyAuthChallengeResponse: Property[String] = Empty) extends Expression[LambdaConfig] {
  def render: Formattable = Value(
    "CreateAuthChallenge" -> createAuthChallenge,
    "PreAuthentication" -> preAuthentication,
    "DefineAuthChallenge" -> defineAuthChallenge,
    "PreSignUp" -> preSignUp,
    "PostAuthentication" -> postAuthentication,
    "PostConfirmation" -> postConfirmation,
    "CustomMessage" -> customMessage,
    "VerifyAuthChallengeResponse" -> verifyAuthChallengeResponse
  )
}
