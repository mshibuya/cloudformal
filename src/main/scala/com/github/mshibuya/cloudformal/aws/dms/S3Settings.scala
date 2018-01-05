package com.github.mshibuya.cloudformal.aws.dms

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html
 */

case class S3Settings(
    externalTableDefinition: Option[String] = None,
    bucketName: Option[String] = None,
    bucketFolder: Option[String] = None,
    csvRowDelimiter: Option[String] = None,
    csvDelimiter: Option[String] = None,
    serviceAccessRoleArn: Option[String] = None,
    compressionType: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ExternalTableDefinition" -> externalTableDefinition.map(Formattable(_)),
    "BucketName" -> bucketName.map(Formattable(_)),
    "BucketFolder" -> bucketFolder.map(Formattable(_)),
    "CsvRowDelimiter" -> csvRowDelimiter.map(Formattable(_)),
    "CsvDelimiter" -> csvDelimiter.map(Formattable(_)),
    "ServiceAccessRoleArn" -> serviceAccessRoleArn.map(Formattable(_)),
    "CompressionType" -> compressionType.map(Formattable(_))
  )
}
