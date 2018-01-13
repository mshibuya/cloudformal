package com.github.mshibuya.cloudformal.aws.dynamodb

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html
 */

trait Table extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::DynamoDB::Table"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  def streamArnAttribute: Expression[String] = Fn.GetAtt(logicalId, "StreamArn")

  def attributeDefinitions: Property[Seq[AttributeDefinition]] = Empty
  def globalSecondaryIndexes: Property[Seq[GlobalSecondaryIndex]] = Empty
  def keySchema: NonEmptyProperty[Seq[KeySchema]]
  def localSecondaryIndexes: Property[Seq[LocalSecondaryIndex]] = Empty
  def provisionedThroughput: NonEmptyProperty[ProvisionedThroughput]
  def streamSpecification: Property[StreamSpecification] = Empty
  def tableName: Property[String] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def timeToLiveSpecification: Property[TimeToLiveSpecification] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AttributeDefinitions" -> attributeDefinitions,
    "GlobalSecondaryIndexes" -> globalSecondaryIndexes,
    "KeySchema" -> keySchema,
    "LocalSecondaryIndexes" -> localSecondaryIndexes,
    "ProvisionedThroughput" -> provisionedThroughput,
    "StreamSpecification" -> streamSpecification,
    "TableName" -> tableName,
    "Tags" -> tags,
    "TimeToLiveSpecification" -> timeToLiveSpecification
  )
}
