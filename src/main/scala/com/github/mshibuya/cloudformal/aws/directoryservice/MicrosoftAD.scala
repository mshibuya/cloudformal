package com.github.mshibuya.cloudformal.aws.directoryservice

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html
 */

trait MicrosoftAD extends Resource[MicrosoftAD] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::DirectoryService::MicrosoftAD"

  object attributes {
    val alias: Expression[String] = Fn.GetAtt(logicalId, "Alias")
    val dnsIpAddresses: Expression[Seq[String]] = Fn.GetAtt(logicalId, "DnsIpAddresses")
  }

  def createAlias: Property[Boolean] = Empty
  def enableSso: Property[Boolean] = Empty
  def name: NonEmptyProperty[String]
  def password: NonEmptyProperty[String]
  def shortName: Property[String] = Empty
  def vpcSettings: NonEmptyProperty[VpcSettings]

  def render(): MapValue[_] = Value(
    "CreateAlias" -> createAlias,
    "EnableSso" -> enableSso,
    "Name" -> name,
    "Password" -> password,
    "ShortName" -> shortName,
    "VpcSettings" -> vpcSettings
  )
}
