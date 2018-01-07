package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html
 */

trait UsagePlanKey extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::UsagePlanKey"

  def keyId: NonEmptyProperty[String]
  def keyType: NonEmptyProperty[String]
  def usagePlanId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "KeyId" -> keyId,
    "KeyType" -> keyType,
    "UsagePlanId" -> usagePlanId
  )
}
