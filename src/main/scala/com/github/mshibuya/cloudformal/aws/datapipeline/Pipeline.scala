package com.github.mshibuya.cloudformal.aws.datapipeline

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html
 */

trait Pipeline extends Resource[Pipeline] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::DataPipeline::Pipeline"

  def activate: Property[Boolean] = Empty
  def description: Property[String] = Empty
  def name: NonEmptyProperty[String]
  def parameterObjects: NonEmptyProperty[Seq[ParameterObject]]
  def parameterValues: Property[Seq[ParameterValue]] = Empty
  def pipelineObjects: Property[Seq[PipelineObject]] = Empty
  def pipelineTags: Property[Seq[PipelineTag]] = Empty

  def render(): MapValue[_] = Value(
    "Activate" -> activate,
    "Description" -> description,
    "Name" -> name,
    "ParameterObjects" -> parameterObjects,
    "ParameterValues" -> parameterValues,
    "PipelineObjects" -> pipelineObjects,
    "PipelineTags" -> pipelineTags
  )
}
