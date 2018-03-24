package com.github.mshibuya.cloudformal.aws.dynamodb

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-keyschema.html
 */

case class KeySchema(
    attributeName: NonEmptyProperty[String],
    keyType: NonEmptyProperty[String]) extends Expression[KeySchema] {
  def render: Formattable = Value(
    "AttributeName" -> attributeName,
    "KeyType" -> keyType
  )
}
