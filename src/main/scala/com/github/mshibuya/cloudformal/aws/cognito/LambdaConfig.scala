package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html
 */

case class LambdaConfig(
    createAuthChallenge: Option[String] = None,
    preAuthentication: Option[String] = None,
    defineAuthChallenge: Option[String] = None,
    preSignUp: Option[String] = None,
    postAuthentication: Option[String] = None,
    postConfirmation: Option[String] = None,
    customMessage: Option[String] = None,
    verifyAuthChallengeResponse: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "CreateAuthChallenge" -> createAuthChallenge.map(Formattable(_)),
    "PreAuthentication" -> preAuthentication.map(Formattable(_)),
    "DefineAuthChallenge" -> defineAuthChallenge.map(Formattable(_)),
    "PreSignUp" -> preSignUp.map(Formattable(_)),
    "PostAuthentication" -> postAuthentication.map(Formattable(_)),
    "PostConfirmation" -> postConfirmation.map(Formattable(_)),
    "CustomMessage" -> customMessage.map(Formattable(_)),
    "VerifyAuthChallengeResponse" -> verifyAuthChallengeResponse.map(Formattable(_))
  )
}
