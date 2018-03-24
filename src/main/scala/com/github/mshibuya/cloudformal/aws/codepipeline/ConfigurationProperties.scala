package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html
 */

case class ConfigurationProperties(
    description: Property[String] = Empty,
    key: NonEmptyProperty[Boolean],
    name: NonEmptyProperty[String],
    queryable: Property[Boolean] = Empty,
    required: NonEmptyProperty[Boolean],
    secret: NonEmptyProperty[Boolean],
    `type`: Property[String] = Empty) extends Expression[ConfigurationProperties] {
  def render: Formattable = Value(
    "Description" -> description,
    "Key" -> key,
    "Name" -> name,
    "Queryable" -> queryable,
    "Required" -> required,
    "Secret" -> secret,
    "Type" -> `type`
  )
}
