package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html
 */

trait EventSourceMapping extends Resource {
  val resourceTypeName = "AWS::Lambda::EventSourceMapping"

  def batchSize: Property[Int] = Empty
  def enabled: Property[Boolean] = Empty
  def eventSourceArn: NonEmptyProperty[String]
  def functionName: NonEmptyProperty[String]
  def startingPosition: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "BatchSize" -> batchSize,
    "Enabled" -> enabled,
    "EventSourceArn" -> eventSourceArn,
    "FunctionName" -> functionName,
    "StartingPosition" -> startingPosition
  )
}
