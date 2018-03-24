package com.github.mshibuya.cloudformal.aws.cloudformation

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitconditionhandle.html
 */

trait WaitConditionHandle extends Resource[WaitConditionHandle] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::CloudFormation::WaitConditionHandle"



  def render(): MapValue[_] = Value()
}
