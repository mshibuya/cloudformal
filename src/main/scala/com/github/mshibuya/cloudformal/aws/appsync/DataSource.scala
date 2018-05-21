package com.github.mshibuya.cloudformal.aws.appsync

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html
 */

trait DataSource extends Resource[DataSource] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::AppSync::DataSource"

  object attributes {
    val dataSourceArn: Expression[String] = Fn.GetAtt(logicalId, "DataSourceArn")
    val name: Expression[String] = Fn.GetAtt(logicalId, "Name")
  }

  def `type`: NonEmptyProperty[String]
  def description: Property[String] = Empty
  def serviceRoleArn: Property[String] = Empty
  def lambdaConfig: Property[LambdaConfig] = Empty
  def apiId: NonEmptyProperty[String]
  def name: NonEmptyProperty[String]
  def dynamoDBConfig: Property[DynamoDBConfig] = Empty
  def elasticsearchConfig: Property[ElasticsearchConfig] = Empty

  def render(): MapValue[_] = Value(
    "Type" -> `type`,
    "Description" -> description,
    "ServiceRoleArn" -> serviceRoleArn,
    "LambdaConfig" -> lambdaConfig,
    "ApiId" -> apiId,
    "Name" -> name,
    "DynamoDBConfig" -> dynamoDBConfig,
    "ElasticsearchConfig" -> elasticsearchConfig
  )
}
