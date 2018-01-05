package com.github.mshibuya.cloudformal.aws.cloudformation

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitconditionhandle.html
 */

trait WaitConditionHandle extends Resource {
  val resourceTypeName = "AWS::CloudFormation::WaitConditionHandle"



  def resourceProperties: FormattableMap = Formattable.opt(

  )
}
