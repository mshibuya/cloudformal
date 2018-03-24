package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html
 */

trait UsagePlan extends model.Resource[UsagePlan] with model.Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ApiGateway::UsagePlan"

  def apiStages: Property[Seq[ApiStage]] = Empty
  def description: Property[String] = Empty
  def quota: Property[QuotaSettings] = Empty
  def throttle: Property[ThrottleSettings] = Empty
  def usagePlanName: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "ApiStages" -> apiStages,
    "Description" -> description,
    "Quota" -> quota,
    "Throttle" -> throttle,
    "UsagePlanName" -> usagePlanName
  )
}
