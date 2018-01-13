package com.github.mshibuya.cloudformal.aws.ssm

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html
 */

trait Document extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::SSM::Document"

  def content: NonEmptyProperty[Json]
  def documentType: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Content" -> content,
    "DocumentType" -> documentType
  )
}
