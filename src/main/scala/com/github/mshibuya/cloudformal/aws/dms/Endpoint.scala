package com.github.mshibuya.cloudformal.aws.dms

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html
 */

trait Endpoint extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::DMS::Endpoint"

  object attributes {
    val externalId: Expression[String] = Fn.GetAtt(logicalId, "ExternalId")
  }

  def kmsKeyId: Property[String] = Empty
  def port: Property[Int] = Empty
  def databaseName: Property[String] = Empty
  def s3Settings: Property[S3Settings] = Empty
  def engineName: NonEmptyProperty[String]
  def dynamoDbSettings: Property[DynamoDbSettings] = Empty
  def username: Property[String] = Empty
  def sslMode: Property[String] = Empty
  def serverName: Property[String] = Empty
  def extraConnectionAttributes: Property[String] = Empty
  def endpointType: NonEmptyProperty[String]
  def tags: Property[Seq[Tag]] = Empty
  def endpointIdentifier: Property[String] = Empty
  def password: Property[String] = Empty
  def certificateArn: Property[String] = Empty
  def mongoDbSettings: Property[MongoDbSettings] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "KmsKeyId" -> kmsKeyId,
    "Port" -> port,
    "DatabaseName" -> databaseName,
    "S3Settings" -> s3Settings,
    "EngineName" -> engineName,
    "DynamoDbSettings" -> dynamoDbSettings,
    "Username" -> username,
    "SslMode" -> sslMode,
    "ServerName" -> serverName,
    "ExtraConnectionAttributes" -> extraConnectionAttributes,
    "EndpointType" -> endpointType,
    "Tags" -> tags,
    "EndpointIdentifier" -> endpointIdentifier,
    "Password" -> password,
    "CertificateArn" -> certificateArn,
    "MongoDbSettings" -> mongoDbSettings
  )
}
