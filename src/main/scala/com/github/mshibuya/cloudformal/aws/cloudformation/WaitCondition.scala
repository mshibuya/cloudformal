package com.github.mshibuya.cloudformal.aws.cloudformation

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html
 */

trait WaitCondition extends Resource with Resource.WithCreationPolicy with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::CloudFormation::WaitCondition"

  object attributes {
    val data: Expression[Json] = Fn.GetAtt(logicalId, "Data")
  }

  def count: Property[Int] = Empty
  def handle: NonEmptyProperty[String]
  def timeout: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Count" -> count,
    "Handle" -> handle,
    "Timeout" -> timeout
  )
}
