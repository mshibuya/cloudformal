package com.github.mshibuya.cloudformal.aws.dms

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html
 */

case class S3Settings(
    externalTableDefinition: Property[String] = Empty,
    bucketName: Property[String] = Empty,
    bucketFolder: Property[String] = Empty,
    csvRowDelimiter: Property[String] = Empty,
    csvDelimiter: Property[String] = Empty,
    serviceAccessRoleArn: Property[String] = Empty,
    compressionType: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ExternalTableDefinition" -> externalTableDefinition,
    "BucketName" -> bucketName,
    "BucketFolder" -> bucketFolder,
    "CsvRowDelimiter" -> csvRowDelimiter,
    "CsvDelimiter" -> csvDelimiter,
    "ServiceAccessRoleArn" -> serviceAccessRoleArn,
    "CompressionType" -> compressionType
  )
}
