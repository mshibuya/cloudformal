package com.github.mshibuya.cloudformal.aws.dms

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html
 */

case class MongoDbSettings(
    authSource: Property[String] = Empty,
    authMechanism: Property[String] = Empty,
    username: Property[String] = Empty,
    docsToInvestigate: Property[String] = Empty,
    serverName: Property[String] = Empty,
    port: Property[Int] = Empty,
    extractDocId: Property[String] = Empty,
    databaseName: Property[String] = Empty,
    authType: Property[String] = Empty,
    password: Property[String] = Empty,
    nestingLevel: Property[String] = Empty) extends Expression[MongoDbSettings] {
  def render: Formattable = Value(
    "AuthSource" -> authSource,
    "AuthMechanism" -> authMechanism,
    "Username" -> username,
    "DocsToInvestigate" -> docsToInvestigate,
    "ServerName" -> serverName,
    "Port" -> port,
    "ExtractDocId" -> extractDocId,
    "DatabaseName" -> databaseName,
    "AuthType" -> authType,
    "Password" -> password,
    "NestingLevel" -> nestingLevel
  )
}
