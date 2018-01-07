package com.github.mshibuya.cloudformal.aws.gamelift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html
 */

trait Build extends Resource {
  val resourceTypeName = "AWS::GameLift::Build"

  def name: Property[String] = Empty
  def storageLocation: Property[S3Location] = Empty
  def version: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Name" -> name,
    "StorageLocation" -> storageLocation,
    "Version" -> version
  )
}
