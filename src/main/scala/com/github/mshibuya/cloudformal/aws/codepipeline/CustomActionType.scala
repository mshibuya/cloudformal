package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html
 */

trait CustomActionType extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::CodePipeline::CustomActionType"

  def category: NonEmptyProperty[String]
  def configurationProperties: Property[Seq[ConfigurationProperties]] = Empty
  def inputArtifactDetails: NonEmptyProperty[ArtifactDetails]
  def outputArtifactDetails: NonEmptyProperty[ArtifactDetails]
  def provider: NonEmptyProperty[String]
  def settings: Property[Settings] = Empty
  def version: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Category" -> category,
    "ConfigurationProperties" -> configurationProperties,
    "InputArtifactDetails" -> inputArtifactDetails,
    "OutputArtifactDetails" -> outputArtifactDetails,
    "Provider" -> provider,
    "Settings" -> settings,
    "Version" -> version
  )
}
