package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html
 */

case class CognitoStreams(
    streamingStatus: Property[String] = Empty,
    streamName: Property[String] = Empty,
    roleArn: Property[String] = Empty) extends Expression[CognitoStreams] {
  def render: Formattable = Value(
    "StreamingStatus" -> streamingStatus,
    "StreamName" -> streamName,
    "RoleArn" -> roleArn
  )
}
