package com.github.mshibuya.cloudformal.aws.datapipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelinetags.html
 */

case class PipelineTag(
    key: NonEmptyProperty[String],
    value: NonEmptyProperty[String]) extends Expression[PipelineTag] {
  def render: Formattable = Value(
    "Key" -> key,
    "Value" -> value
  )
}
