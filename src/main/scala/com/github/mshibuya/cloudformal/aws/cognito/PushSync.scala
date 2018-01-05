package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html
 */

case class PushSync(
    applicationArns: Option[Seq[String]] = None,
    roleArn: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ApplicationArns" -> applicationArns.map(Formattable(_)),
    "RoleArn" -> roleArn.map(Formattable(_))
  )
}
