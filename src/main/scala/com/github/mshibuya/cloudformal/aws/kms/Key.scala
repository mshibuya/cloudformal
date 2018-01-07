package com.github.mshibuya.cloudformal.aws.kms

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html
 */

trait Key extends Resource {
  val resourceTypeName = "AWS::KMS::Key"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def description: Property[String] = Empty
  def enableKeyRotation: Property[Boolean] = Empty
  def enabled: Property[Boolean] = Empty
  def keyPolicy: NonEmptyProperty[Json]
  def keyUsage: Property[String] = Empty
  def tags: Property[Seq[Tag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Description" -> description,
    "EnableKeyRotation" -> enableKeyRotation,
    "Enabled" -> enabled,
    "KeyPolicy" -> keyPolicy,
    "KeyUsage" -> keyUsage,
    "Tags" -> tags
  )
}
