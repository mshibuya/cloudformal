package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html
 */

trait UsagePlanKey extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::UsagePlanKey"

  def keyId: String
  def keyType: String
  def usagePlanId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "KeyId" -> Some(Formattable(keyId)),
    "KeyType" -> Some(Formattable(keyType)),
    "UsagePlanId" -> Some(Formattable(usagePlanId))
  )
}
