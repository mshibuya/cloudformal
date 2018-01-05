package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html
 */

case class CognitoStreams(
    streamingStatus: Option[String] = None,
    streamName: Option[String] = None,
    roleArn: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "StreamingStatus" -> streamingStatus.map(Formattable(_)),
    "StreamName" -> streamName.map(Formattable(_)),
    "RoleArn" -> roleArn.map(Formattable(_))
  )
}
