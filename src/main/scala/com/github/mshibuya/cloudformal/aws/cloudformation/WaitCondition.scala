package com.github.mshibuya.cloudformal.aws.cloudformation

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html
 */

trait WaitCondition extends Resource {
  val resourceTypeName = "AWS::CloudFormation::WaitCondition"

  def count: Option[Int] = None
  def handle: String
  def timeout: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "Count" -> count.map(Formattable(_)),
    "Handle" -> Some(Formattable(handle)),
    "Timeout" -> Some(Formattable(timeout))
  )
}
