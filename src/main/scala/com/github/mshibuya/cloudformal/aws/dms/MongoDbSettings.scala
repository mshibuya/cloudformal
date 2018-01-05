package com.github.mshibuya.cloudformal.aws.dms

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html
 */

case class MongoDbSettings(
    authSource: Option[String] = None,
    authMechanism: Option[String] = None,
    username: Option[String] = None,
    docsToInvestigate: Option[String] = None,
    serverName: Option[String] = None,
    port: Option[Int] = None,
    extractDocId: Option[String] = None,
    databaseName: Option[String] = None,
    authType: Option[String] = None,
    password: Option[String] = None,
    nestingLevel: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AuthSource" -> authSource.map(Formattable(_)),
    "AuthMechanism" -> authMechanism.map(Formattable(_)),
    "Username" -> username.map(Formattable(_)),
    "DocsToInvestigate" -> docsToInvestigate.map(Formattable(_)),
    "ServerName" -> serverName.map(Formattable(_)),
    "Port" -> port.map(Formattable(_)),
    "ExtractDocId" -> extractDocId.map(Formattable(_)),
    "DatabaseName" -> databaseName.map(Formattable(_)),
    "AuthType" -> authType.map(Formattable(_)),
    "Password" -> password.map(Formattable(_)),
    "NestingLevel" -> nestingLevel.map(Formattable(_))
  )
}
