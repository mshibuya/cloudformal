package com.github.mshibuya.cloudformal.aws.appsync

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html
 */

case class ElasticsearchConfig(
    awsRegion: NonEmptyProperty[String],
    endpoint: NonEmptyProperty[String]) extends Expression[ElasticsearchConfig] {
  def render: Formattable = Value(
    "AwsRegion" -> awsRegion,
    "Endpoint" -> endpoint
  )
}
