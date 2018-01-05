package com.github.mshibuya.cloudformal.aws.datapipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html
 */

trait Pipeline extends Resource {
  val resourceTypeName = "AWS::DataPipeline::Pipeline"

  def activate: Option[Boolean] = None
  def description: Option[String] = None
  def name: String
  def parameterObjects: Seq[ParameterObject]
  def parameterValues: Option[Seq[ParameterValue]] = None
  def pipelineObjects: Option[Seq[PipelineObject]] = None
  def pipelineTags: Option[Seq[PipelineTag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Activate" -> activate.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "Name" -> Some(Formattable(name)),
    "ParameterObjects" -> Some(Formattable(parameterObjects)),
    "ParameterValues" -> parameterValues.map(Formattable(_)),
    "PipelineObjects" -> pipelineObjects.map(Formattable(_)),
    "PipelineTags" -> pipelineTags.map(Formattable(_))
  )
}
