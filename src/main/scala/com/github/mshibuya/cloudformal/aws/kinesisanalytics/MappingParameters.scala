package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-mappingparameters.html
 */

case class MappingParameters(
    jSONMappingParameters: Option[JSONMappingParameters] = None,
    cSVMappingParameters: Option[CSVMappingParameters] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "JSONMappingParameters" -> jSONMappingParameters.map(Formattable(_)),
    "CSVMappingParameters" -> cSVMappingParameters.map(Formattable(_))
  )
}
