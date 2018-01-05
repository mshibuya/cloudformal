package com.github.mshibuya.cloudformal.aws.cloudformation

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html
 */

trait CustomResource extends Resource {
  val resourceTypeName = "AWS::CloudFormation::CustomResource"

  def serviceToken: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "ServiceToken" -> Some(Formattable(serviceToken))
  )
}
