package com.github.mshibuya.cloudformal.aws.dynamodb

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html
 */

trait Table extends Resource {
  val resourceTypeName = "AWS::DynamoDB::Table"

  def attributeDefinitions: Option[Seq[AttributeDefinition]] = None
  def globalSecondaryIndexes: Option[Seq[GlobalSecondaryIndex]] = None
  def keySchema: Seq[KeySchema]
  def localSecondaryIndexes: Option[Seq[LocalSecondaryIndex]] = None
  def provisionedThroughput: ProvisionedThroughput
  def streamSpecification: Option[StreamSpecification] = None
  def tableName: Option[String] = None
  def tags: Option[Seq[Tag]] = None
  def timeToLiveSpecification: Option[TimeToLiveSpecification] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AttributeDefinitions" -> attributeDefinitions.map(Formattable(_)),
    "GlobalSecondaryIndexes" -> globalSecondaryIndexes.map(Formattable(_)),
    "KeySchema" -> Some(Formattable(keySchema)),
    "LocalSecondaryIndexes" -> localSecondaryIndexes.map(Formattable(_)),
    "ProvisionedThroughput" -> Some(Formattable(provisionedThroughput)),
    "StreamSpecification" -> streamSpecification.map(Formattable(_)),
    "TableName" -> tableName.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "TimeToLiveSpecification" -> timeToLiveSpecification.map(Formattable(_))
  )
}
