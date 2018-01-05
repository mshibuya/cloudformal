package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html
 */

trait EventSourceMapping extends Resource {
  val resourceTypeName = "AWS::Lambda::EventSourceMapping"

  def batchSize: Option[Int] = None
  def enabled: Option[Boolean] = None
  def eventSourceArn: String
  def functionName: String
  def startingPosition: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "BatchSize" -> batchSize.map(Formattable(_)),
    "Enabled" -> enabled.map(Formattable(_)),
    "EventSourceArn" -> Some(Formattable(eventSourceArn)),
    "FunctionName" -> Some(Formattable(functionName)),
    "StartingPosition" -> Some(Formattable(startingPosition))
  )
}
