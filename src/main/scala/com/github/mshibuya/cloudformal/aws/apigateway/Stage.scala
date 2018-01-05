package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html
 */

trait Stage extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::Stage"

  def cacheClusterEnabled: Option[Boolean] = None
  def cacheClusterSize: Option[String] = None
  def clientCertificateId: Option[String] = None
  def deploymentId: Option[String] = None
  def description: Option[String] = None
  def documentationVersion: Option[String] = None
  def methodSettings: Option[Seq[MethodSetting]] = None
  def restApiId: String
  def stageName: Option[String] = None
  def variables: Option[ListMap[String, String]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "CacheClusterEnabled" -> cacheClusterEnabled.map(Formattable(_)),
    "CacheClusterSize" -> cacheClusterSize.map(Formattable(_)),
    "ClientCertificateId" -> clientCertificateId.map(Formattable(_)),
    "DeploymentId" -> deploymentId.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "DocumentationVersion" -> documentationVersion.map(Formattable(_)),
    "MethodSettings" -> methodSettings.map(Formattable(_)),
    "RestApiId" -> Some(Formattable(restApiId)),
    "StageName" -> stageName.map(Formattable(_)),
    "Variables" -> variables.map(Formattable(_))
  )
}
