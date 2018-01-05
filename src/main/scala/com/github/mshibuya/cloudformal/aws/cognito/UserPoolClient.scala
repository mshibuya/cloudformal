package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html
 */

trait UserPoolClient extends Resource {
  val resourceTypeName = "AWS::Cognito::UserPoolClient"

  def generateSecret: Option[Boolean] = None
  def clientName: Option[String] = None
  def userPoolId: String
  def explicitAuthFlows: Option[Seq[String]] = None
  def refreshTokenValidity: Option[Double] = None
  def readAttributes: Option[Seq[String]] = None
  def writeAttributes: Option[Seq[String]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "GenerateSecret" -> generateSecret.map(Formattable(_)),
    "ClientName" -> clientName.map(Formattable(_)),
    "UserPoolId" -> Some(Formattable(userPoolId)),
    "ExplicitAuthFlows" -> explicitAuthFlows.map(Formattable(_)),
    "RefreshTokenValidity" -> refreshTokenValidity.map(Formattable(_)),
    "ReadAttributes" -> readAttributes.map(Formattable(_)),
    "WriteAttributes" -> writeAttributes.map(Formattable(_))
  )
}
