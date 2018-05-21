package com.github.mshibuya.cloudformal.aws.servicecatalog

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html
 */

trait CloudFormationProvisionedProduct extends Resource[CloudFormationProvisionedProduct] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ServiceCatalog::CloudFormationProvisionedProduct"

  object attributes {
    val cloudformationStackArn: Expression[String] = Fn.GetAtt(logicalId, "CloudformationStackArn")
    val recordId: Expression[String] = Fn.GetAtt(logicalId, "RecordId")
  }

  def pathId: Property[String] = Empty
  def provisioningParameters: Property[Seq[ProvisioningParameter]] = Empty
  def productName: Property[String] = Empty
  def provisioningArtifactName: Property[String] = Empty
  def notificationArns: Property[Seq[String]] = Empty
  def acceptLanguage: Property[String] = Empty
  def productId: Property[String] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def provisionedProductName: Property[String] = Empty
  def provisioningArtifactId: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "PathId" -> pathId,
    "ProvisioningParameters" -> provisioningParameters,
    "ProductName" -> productName,
    "ProvisioningArtifactName" -> provisioningArtifactName,
    "NotificationArns" -> notificationArns,
    "AcceptLanguage" -> acceptLanguage,
    "ProductId" -> productId,
    "Tags" -> tags,
    "ProvisionedProductName" -> provisionedProductName,
    "ProvisioningArtifactId" -> provisioningArtifactId
  )
}
