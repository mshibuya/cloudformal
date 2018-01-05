package com.github.mshibuya.cloudformal.aws.gamelift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html
 */

trait Build extends Resource {
  val resourceTypeName = "AWS::GameLift::Build"

  def name: Option[String] = None
  def storageLocation: Option[S3Location] = None
  def version: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Name" -> name.map(Formattable(_)),
    "StorageLocation" -> storageLocation.map(Formattable(_)),
    "Version" -> version.map(Formattable(_))
  )
}
