package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html
 */

case class ConfigurationProperties(
    description: Option[String] = None,
    key: Boolean,
    name: String,
    queryable: Option[Boolean] = None,
    required: Boolean,
    secret: Boolean,
    `type`: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Description" -> description.map(Formattable(_)),
    "Key" -> Some(Formattable(key)),
    "Name" -> Some(Formattable(name)),
    "Queryable" -> queryable.map(Formattable(_)),
    "Required" -> Some(Formattable(required)),
    "Secret" -> Some(Formattable(secret)),
    "Type" -> `type`.map(Formattable(_))
  )
}
