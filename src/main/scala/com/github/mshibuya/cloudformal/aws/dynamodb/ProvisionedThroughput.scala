package com.github.mshibuya.cloudformal.aws.dynamodb

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html
 */

case class ProvisionedThroughput(
    readCapacityUnits: NonEmptyProperty[Long],
    writeCapacityUnits: NonEmptyProperty[Long]) extends Expression[ProvisionedThroughput] {
  def render: Formattable = Value(
    "ReadCapacityUnits" -> readCapacityUnits,
    "WriteCapacityUnits" -> writeCapacityUnits
  )
}
