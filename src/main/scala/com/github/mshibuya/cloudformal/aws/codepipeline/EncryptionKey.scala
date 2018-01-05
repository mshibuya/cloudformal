package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore-encryptionkey.html
 */

case class EncryptionKey(
    id: String,
    `type`: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Id" -> Some(Formattable(id)),
    "Type" -> Some(Formattable(`type`))
  )
}
