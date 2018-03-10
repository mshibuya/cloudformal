package com.github.mshibuya.cloudformal.aws.codebuild

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html
 */

trait Project extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::CodeBuild::Project"

  object attributes {
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def description: Property[String] = Empty
  def vpcConfig: Property[VpcConfig] = Empty
  def encryptionKey: Property[String] = Empty
  def triggers: Property[ProjectTriggers] = Empty
  def source: NonEmptyProperty[Source]
  def name: Property[String] = Empty
  def artifacts: NonEmptyProperty[Artifacts]
  def badgeEnabled: Property[Boolean] = Empty
  def serviceRole: NonEmptyProperty[String]
  def environment: NonEmptyProperty[Environment]
  def tags: Property[Seq[Tag]] = Empty
  def timeoutInMinutes: Property[Int] = Empty
  def cache: Property[ProjectCache] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Description" -> description,
    "VpcConfig" -> vpcConfig,
    "EncryptionKey" -> encryptionKey,
    "Triggers" -> triggers,
    "Source" -> source,
    "Name" -> name,
    "Artifacts" -> artifacts,
    "BadgeEnabled" -> badgeEnabled,
    "ServiceRole" -> serviceRole,
    "Environment" -> environment,
    "Tags" -> tags,
    "TimeoutInMinutes" -> timeoutInMinutes,
    "Cache" -> cache
  )
}
