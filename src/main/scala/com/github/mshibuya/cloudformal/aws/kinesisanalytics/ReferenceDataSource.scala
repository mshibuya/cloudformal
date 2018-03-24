package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html
 */

case class ReferenceDataSource(
    referenceSchema: NonEmptyProperty[ReferenceSchema],
    tableName: Property[String] = Empty,
    s3ReferenceDataSource: Property[S3ReferenceDataSource] = Empty) extends Expression[ReferenceDataSource] {
  def render: Formattable = Value(
    "ReferenceSchema" -> referenceSchema,
    "TableName" -> tableName,
    "S3ReferenceDataSource" -> s3ReferenceDataSource
  )
}
