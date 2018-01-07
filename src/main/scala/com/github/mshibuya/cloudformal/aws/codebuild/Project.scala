package com.github.mshibuya.cloudformal.aws.codebuild

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html
 */

trait Project extends Resource {
  val resourceTypeName = "AWS::CodeBuild::Project"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def artifacts: NonEmptyProperty[Artifacts]
  def badgeEnabled: Property[Boolean] = Empty
  def description: Property[String] = Empty
  def serviceRole: NonEmptyProperty[String]
  def vpcConfig: Property[VpcConfig] = Empty
  def environment: NonEmptyProperty[Environment]
  def encryptionKey: Property[String] = Empty
  def source: NonEmptyProperty[Source]
  def tags: Property[Seq[Tag]] = Empty
  def name: Property[String] = Empty
  def timeoutInMinutes: Property[Int] = Empty
  def cache: Property[ProjectCache] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Artifacts" -> artifacts,
    "BadgeEnabled" -> badgeEnabled,
    "Description" -> description,
    "ServiceRole" -> serviceRole,
    "VpcConfig" -> vpcConfig,
    "Environment" -> environment,
    "EncryptionKey" -> encryptionKey,
    "Source" -> source,
    "Tags" -> tags,
    "Name" -> name,
    "TimeoutInMinutes" -> timeoutInMinutes,
    "Cache" -> cache
  )
}
