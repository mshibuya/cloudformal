package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html
 */

case class ReferenceDataSource(
    referenceSchema: ReferenceSchema,
    tableName: Option[String] = None,
    s3ReferenceDataSource: Option[S3ReferenceDataSource] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ReferenceSchema" -> Some(Formattable(referenceSchema)),
    "TableName" -> tableName.map(Formattable(_)),
    "S3ReferenceDataSource" -> s3ReferenceDataSource.map(Formattable(_))
  )
}
