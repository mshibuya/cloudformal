package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html
 */

trait UserPoolClient extends Resource[UserPoolClient] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Cognito::UserPoolClient"

  object attributes {
    val clientSecret: Expression[String] = Fn.GetAtt(logicalId, "ClientSecret")
    val name: Expression[String] = Fn.GetAtt(logicalId, "Name")
  }

  def generateSecret: Property[Boolean] = Empty
  def clientName: Property[String] = Empty
  def userPoolId: NonEmptyProperty[String]
  def explicitAuthFlows: Property[Seq[String]] = Empty
  def refreshTokenValidity: Property[Double] = Empty
  def readAttributes: Property[Seq[String]] = Empty
  def writeAttributes: Property[Seq[String]] = Empty

  def render(): MapValue[_] = Value(
    "GenerateSecret" -> generateSecret,
    "ClientName" -> clientName,
    "UserPoolId" -> userPoolId,
    "ExplicitAuthFlows" -> explicitAuthFlows,
    "RefreshTokenValidity" -> refreshTokenValidity,
    "ReadAttributes" -> readAttributes,
    "WriteAttributes" -> writeAttributes
  )
}
