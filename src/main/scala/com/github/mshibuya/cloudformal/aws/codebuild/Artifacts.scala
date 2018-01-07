package com.github.mshibuya.cloudformal.aws.codebuild

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html
 */

case class Artifacts(
    path: Property[String] = Empty,
    `type`: NonEmptyProperty[String],
    packaging: Property[String] = Empty,
    location: Property[String] = Empty,
    name: Property[String] = Empty,
    namespaceType: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Path" -> path,
    "Type" -> `type`,
    "Packaging" -> packaging,
    "Location" -> location,
    "Name" -> name,
    "NamespaceType" -> namespaceType
  )
}
