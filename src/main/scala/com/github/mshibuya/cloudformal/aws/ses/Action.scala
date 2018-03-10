package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html
 */

case class Action(
    bounceAction: Property[BounceAction] = Empty,
    s3Action: Property[S3Action] = Empty,
    stopAction: Property[StopAction] = Empty,
    snsAction: Property[SNSAction] = Empty,
    workmailAction: Property[WorkmailAction] = Empty,
    addHeaderAction: Property[AddHeaderAction] = Empty,
    lambdaAction: Property[LambdaAction] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "BounceAction" -> bounceAction,
    "S3Action" -> s3Action,
    "StopAction" -> stopAction,
    "SNSAction" -> snsAction,
    "WorkmailAction" -> workmailAction,
    "AddHeaderAction" -> addHeaderAction,
    "LambdaAction" -> lambdaAction
  )
}
