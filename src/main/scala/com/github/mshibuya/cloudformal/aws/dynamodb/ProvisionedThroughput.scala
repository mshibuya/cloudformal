package com.github.mshibuya.cloudformal.aws.dynamodb

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html
 */

case class ProvisionedThroughput(
    readCapacityUnits: NonEmptyProperty[Long],
    writeCapacityUnits: NonEmptyProperty[Long]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ReadCapacityUnits" -> readCapacityUnits,
    "WriteCapacityUnits" -> writeCapacityUnits
  )
}
