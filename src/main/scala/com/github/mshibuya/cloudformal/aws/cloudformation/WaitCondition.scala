package com.github.mshibuya.cloudformal.aws.cloudformation

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html
 */

trait WaitCondition extends Resource {
  val resourceTypeName = "AWS::CloudFormation::WaitCondition"

  def dataAttribute: Expression[Json] = Fn.GetAtt(logicalId, "Data")

  def count: Property[Int] = Empty
  def handle: NonEmptyProperty[String]
  def timeout: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Count" -> count,
    "Handle" -> handle,
    "Timeout" -> timeout
  )
}
