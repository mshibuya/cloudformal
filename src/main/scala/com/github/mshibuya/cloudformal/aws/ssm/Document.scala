package com.github.mshibuya.cloudformal.aws.ssm

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html
 */

trait Document extends Resource {
  val resourceTypeName = "AWS::SSM::Document"

  def content: Json
  def documentType: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Content" -> Some(Formattable(content)),
    "DocumentType" -> documentType.map(Formattable(_))
  )
}
