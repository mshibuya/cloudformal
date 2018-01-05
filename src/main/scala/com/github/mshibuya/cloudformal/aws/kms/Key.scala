package com.github.mshibuya.cloudformal.aws.kms

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html
 */

trait Key extends Resource {
  val resourceTypeName = "AWS::KMS::Key"

  def description: Option[String] = None
  def enableKeyRotation: Option[Boolean] = None
  def enabled: Option[Boolean] = None
  def keyPolicy: Json
  def keyUsage: Option[String] = None
  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> description.map(Formattable(_)),
    "EnableKeyRotation" -> enableKeyRotation.map(Formattable(_)),
    "Enabled" -> enabled.map(Formattable(_)),
    "KeyPolicy" -> Some(Formattable(keyPolicy)),
    "KeyUsage" -> keyUsage.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_))
  )
}
