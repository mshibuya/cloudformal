package com.github.mshibuya.cloudformal.aws.kms

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html
 */

trait Key extends Resource[Key] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::KMS::Key"

  object attributes {
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def description: Property[String] = Empty
  def enableKeyRotation: Property[Boolean] = Empty
  def enabled: Property[Boolean] = Empty
  def keyPolicy: NonEmptyProperty[Json]
  def keyUsage: Property[String] = Empty
  def tags: Property[Seq[Tag]] = Empty

  def render(): MapValue[_] = Value(
    "Description" -> description,
    "EnableKeyRotation" -> enableKeyRotation,
    "Enabled" -> enabled,
    "KeyPolicy" -> keyPolicy,
    "KeyUsage" -> keyUsage,
    "Tags" -> tags
  )
}
