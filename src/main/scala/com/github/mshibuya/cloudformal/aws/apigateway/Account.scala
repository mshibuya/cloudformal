package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html
 */

trait Account extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::Account"

  def cloudWatchRoleArn: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "CloudWatchRoleArn" -> cloudWatchRoleArn
  )
}
