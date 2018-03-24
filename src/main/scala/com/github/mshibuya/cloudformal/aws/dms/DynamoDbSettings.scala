package com.github.mshibuya.cloudformal.aws.dms

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-dynamodbsettings.html
 */

case class DynamoDbSettings(
    serviceAccessRoleArn: Property[String] = Empty) extends Expression[DynamoDbSettings] {
  def render: Formattable = Value(
    "ServiceAccessRoleArn" -> serviceAccessRoleArn
  )
}
