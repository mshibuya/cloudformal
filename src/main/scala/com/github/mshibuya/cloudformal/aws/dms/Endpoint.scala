package com.github.mshibuya.cloudformal.aws.dms

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html
 */

trait Endpoint extends Resource {
  val resourceTypeName = "AWS::DMS::Endpoint"

  def kmsKeyId: Option[String] = None
  def port: Option[Int] = None
  def databaseName: Option[String] = None
  def s3Settings: Option[S3Settings] = None
  def engineName: String
  def dynamoDbSettings: Option[DynamoDbSettings] = None
  def username: Option[String] = None
  def sslMode: Option[String] = None
  def serverName: Option[String] = None
  def extraConnectionAttributes: Option[String] = None
  def endpointType: String
  def tags: Option[Seq[Tag]] = None
  def endpointIdentifier: Option[String] = None
  def password: Option[String] = None
  def certificateArn: Option[String] = None
  def mongoDbSettings: Option[MongoDbSettings] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "KmsKeyId" -> kmsKeyId.map(Formattable(_)),
    "Port" -> port.map(Formattable(_)),
    "DatabaseName" -> databaseName.map(Formattable(_)),
    "S3Settings" -> s3Settings.map(Formattable(_)),
    "EngineName" -> Some(Formattable(engineName)),
    "DynamoDbSettings" -> dynamoDbSettings.map(Formattable(_)),
    "Username" -> username.map(Formattable(_)),
    "SslMode" -> sslMode.map(Formattable(_)),
    "ServerName" -> serverName.map(Formattable(_)),
    "ExtraConnectionAttributes" -> extraConnectionAttributes.map(Formattable(_)),
    "EndpointType" -> Some(Formattable(endpointType)),
    "Tags" -> tags.map(Formattable(_)),
    "EndpointIdentifier" -> endpointIdentifier.map(Formattable(_)),
    "Password" -> password.map(Formattable(_)),
    "CertificateArn" -> certificateArn.map(Formattable(_)),
    "MongoDbSettings" -> mongoDbSettings.map(Formattable(_))
  )
}
