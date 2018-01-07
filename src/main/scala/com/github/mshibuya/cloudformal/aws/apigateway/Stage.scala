package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html
 */

trait Stage extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::Stage"

  def cacheClusterEnabled: Property[Boolean] = Empty
  def cacheClusterSize: Property[String] = Empty
  def clientCertificateId: Property[String] = Empty
  def deploymentId: Property[String] = Empty
  def description: Property[String] = Empty
  def documentationVersion: Property[String] = Empty
  def methodSettings: Property[Seq[MethodSetting]] = Empty
  def restApiId: NonEmptyProperty[String]
  def stageName: Property[String] = Empty
  def variables: Property[ListMap[String, String]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "CacheClusterEnabled" -> cacheClusterEnabled,
    "CacheClusterSize" -> cacheClusterSize,
    "ClientCertificateId" -> clientCertificateId,
    "DeploymentId" -> deploymentId,
    "Description" -> description,
    "DocumentationVersion" -> documentationVersion,
    "MethodSettings" -> methodSettings,
    "RestApiId" -> restApiId,
    "StageName" -> stageName,
    "Variables" -> variables
  )
}
