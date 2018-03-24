package com.github.mshibuya.cloudformal.aws.elasticsearch

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html
 */

trait Domain extends Resource[Domain] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Elasticsearch::Domain"

  object attributes {
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
    val domainArn: Expression[String] = Fn.GetAtt(logicalId, "DomainArn")
    val domainEndpoint: Expression[String] = Fn.GetAtt(logicalId, "DomainEndpoint")
  }

  def accessPolicies: Property[Json] = Empty
  def advancedOptions: Property[ListMap[String, String]] = Empty
  def domainName: Property[String] = Empty
  def ebsOptions: Property[EBSOptions] = Empty
  def elasticsearchClusterConfig: Property[ElasticsearchClusterConfig] = Empty
  def elasticsearchVersion: Property[String] = Empty
  def snapshotOptions: Property[SnapshotOptions] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def vpcOptions: Property[VPCOptions] = Empty

  def render(): MapValue[_] = Value(
    "AccessPolicies" -> accessPolicies,
    "AdvancedOptions" -> advancedOptions,
    "DomainName" -> domainName,
    "EBSOptions" -> ebsOptions,
    "ElasticsearchClusterConfig" -> elasticsearchClusterConfig,
    "ElasticsearchVersion" -> elasticsearchVersion,
    "SnapshotOptions" -> snapshotOptions,
    "Tags" -> tags,
    "VPCOptions" -> vpcOptions
  )
}
