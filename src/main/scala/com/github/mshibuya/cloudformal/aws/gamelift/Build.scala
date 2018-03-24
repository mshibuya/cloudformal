package com.github.mshibuya.cloudformal.aws.gamelift

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html
 */

trait Build extends Resource[Build] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::GameLift::Build"

  def name: Property[String] = Empty
  def storageLocation: Property[S3Location] = Empty
  def version: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "Name" -> name,
    "StorageLocation" -> storageLocation,
    "Version" -> version
  )
}
