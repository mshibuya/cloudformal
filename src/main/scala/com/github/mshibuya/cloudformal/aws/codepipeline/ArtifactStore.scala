package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html
 */

case class ArtifactStore(
    encryptionKey: Option[EncryptionKey] = None,
    location: String,
    `type`: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "EncryptionKey" -> encryptionKey.map(Formattable(_)),
    "Location" -> Some(Formattable(location)),
    "Type" -> Some(Formattable(`type`))
  )
}
