package com.github.mshibuya.cloudformal.aws.codebuild

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html
 */

case class SourceAuth(
    `type`: NonEmptyProperty[String],
    resource: Property[String] = Empty) extends Expression[SourceAuth] {
  def render: Formattable = Value(
    "Type" -> `type`,
    "Resource" -> resource
  )
}
