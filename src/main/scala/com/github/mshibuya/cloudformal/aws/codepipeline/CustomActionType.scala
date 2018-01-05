package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html
 */

trait CustomActionType extends Resource {
  val resourceTypeName = "AWS::CodePipeline::CustomActionType"

  def category: String
  def configurationProperties: Option[Seq[ConfigurationProperties]] = None
  def inputArtifactDetails: ArtifactDetails
  def outputArtifactDetails: ArtifactDetails
  def provider: String
  def settings: Option[Settings] = None
  def version: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Category" -> Some(Formattable(category)),
    "ConfigurationProperties" -> configurationProperties.map(Formattable(_)),
    "InputArtifactDetails" -> Some(Formattable(inputArtifactDetails)),
    "OutputArtifactDetails" -> Some(Formattable(outputArtifactDetails)),
    "Provider" -> Some(Formattable(provider)),
    "Settings" -> settings.map(Formattable(_)),
    "Version" -> version.map(Formattable(_))
  )
}
