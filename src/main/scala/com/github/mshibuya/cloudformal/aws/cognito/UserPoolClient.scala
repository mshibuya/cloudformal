package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html
 */

trait UserPoolClient extends Resource {
  val resourceTypeName = "AWS::Cognito::UserPoolClient"

  def clientSecretAttribute: Expression[String] = Fn.GetAtt(logicalId, "ClientSecret")
  def nameAttribute: Expression[String] = Fn.GetAtt(logicalId, "Name")

  def generateSecret: Property[Boolean] = Empty
  def clientName: Property[String] = Empty
  def userPoolId: NonEmptyProperty[String]
  def explicitAuthFlows: Property[Seq[String]] = Empty
  def refreshTokenValidity: Property[Double] = Empty
  def readAttributes: Property[Seq[String]] = Empty
  def writeAttributes: Property[Seq[String]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "GenerateSecret" -> generateSecret,
    "ClientName" -> clientName,
    "UserPoolId" -> userPoolId,
    "ExplicitAuthFlows" -> explicitAuthFlows,
    "RefreshTokenValidity" -> refreshTokenValidity,
    "ReadAttributes" -> readAttributes,
    "WriteAttributes" -> writeAttributes
  )
}
