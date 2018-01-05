package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html
 */

trait UsagePlan extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::UsagePlan"

  def apiStages: Option[Seq[ApiStage]] = None
  def description: Option[String] = None
  def quota: Option[QuotaSettings] = None
  def throttle: Option[ThrottleSettings] = None
  def usagePlanName: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "ApiStages" -> apiStages.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "Quota" -> quota.map(Formattable(_)),
    "Throttle" -> throttle.map(Formattable(_)),
    "UsagePlanName" -> usagePlanName.map(Formattable(_))
  )
}
