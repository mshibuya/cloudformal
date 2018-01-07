package com.github.mshibuya.cloudformal.aws.datapipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html
 */

trait Pipeline extends Resource {
  val resourceTypeName = "AWS::DataPipeline::Pipeline"

  def activate: Property[Boolean] = Empty
  def description: Property[String] = Empty
  def name: NonEmptyProperty[String]
  def parameterObjects: NonEmptyProperty[Seq[ParameterObject]]
  def parameterValues: Property[Seq[ParameterValue]] = Empty
  def pipelineObjects: Property[Seq[PipelineObject]] = Empty
  def pipelineTags: Property[Seq[PipelineTag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Activate" -> activate,
    "Description" -> description,
    "Name" -> name,
    "ParameterObjects" -> parameterObjects,
    "ParameterValues" -> parameterValues,
    "PipelineObjects" -> pipelineObjects,
    "PipelineTags" -> pipelineTags
  )
}
