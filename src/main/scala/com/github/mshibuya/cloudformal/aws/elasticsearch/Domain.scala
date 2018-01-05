package com.github.mshibuya.cloudformal.aws.elasticsearch

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html
 */

trait Domain extends Resource {
  val resourceTypeName = "AWS::Elasticsearch::Domain"

  def accessPolicies: Option[Json] = None
  def advancedOptions: Option[ListMap[String, String]] = None
  def domainName: Option[String] = None
  def eBSOptions: Option[EBSOptions] = None
  def elasticsearchClusterConfig: Option[ElasticsearchClusterConfig] = None
  def elasticsearchVersion: Option[String] = None
  def snapshotOptions: Option[SnapshotOptions] = None
  def tags: Option[Seq[Tag]] = None
  def vPCOptions: Option[VPCOptions] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AccessPolicies" -> accessPolicies.map(Formattable(_)),
    "AdvancedOptions" -> advancedOptions.map(Formattable(_)),
    "DomainName" -> domainName.map(Formattable(_)),
    "EBSOptions" -> eBSOptions.map(Formattable(_)),
    "ElasticsearchClusterConfig" -> elasticsearchClusterConfig.map(Formattable(_)),
    "ElasticsearchVersion" -> elasticsearchVersion.map(Formattable(_)),
    "SnapshotOptions" -> snapshotOptions.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "VPCOptions" -> vPCOptions.map(Formattable(_))
  )
}
