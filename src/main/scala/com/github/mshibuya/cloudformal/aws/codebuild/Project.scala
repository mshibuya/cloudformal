package com.github.mshibuya.cloudformal.aws.codebuild

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html
 */

trait Project extends Resource {
  val resourceTypeName = "AWS::CodeBuild::Project"

  def artifacts: Artifacts
  def badgeEnabled: Option[Boolean] = None
  def description: Option[String] = None
  def serviceRole: String
  def vpcConfig: Option[VpcConfig] = None
  def environment: Environment
  def encryptionKey: Option[String] = None
  def source: Source
  def tags: Option[Seq[Tag]] = None
  def name: Option[String] = None
  def timeoutInMinutes: Option[Int] = None
  def cache: Option[ProjectCache] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Artifacts" -> Some(Formattable(artifacts)),
    "BadgeEnabled" -> badgeEnabled.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "ServiceRole" -> Some(Formattable(serviceRole)),
    "VpcConfig" -> vpcConfig.map(Formattable(_)),
    "Environment" -> Some(Formattable(environment)),
    "EncryptionKey" -> encryptionKey.map(Formattable(_)),
    "Source" -> Some(Formattable(source)),
    "Tags" -> tags.map(Formattable(_)),
    "Name" -> name.map(Formattable(_)),
    "TimeoutInMinutes" -> timeoutInMinutes.map(Formattable(_)),
    "Cache" -> cache.map(Formattable(_))
  )
}
