package com.github.mshibuya.cloudformal.aws.codebuild

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html
 */

case class Artifacts(
    path: Option[String] = None,
    `type`: String,
    packaging: Option[String] = None,
    location: Option[String] = None,
    name: Option[String] = None,
    namespaceType: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Path" -> path.map(Formattable(_)),
    "Type" -> Some(Formattable(`type`)),
    "Packaging" -> packaging.map(Formattable(_)),
    "Location" -> location.map(Formattable(_)),
    "Name" -> name.map(Formattable(_)),
    "NamespaceType" -> namespaceType.map(Formattable(_))
  )
}
