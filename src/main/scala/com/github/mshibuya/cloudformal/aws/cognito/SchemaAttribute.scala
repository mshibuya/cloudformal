package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html
 */

case class SchemaAttribute(
    developerOnlyAttribute: Option[Boolean] = None,
    mutable: Option[Boolean] = None,
    attributeDataType: Option[String] = None,
    stringAttributeConstraints: Option[StringAttributeConstraints] = None,
    required: Option[Boolean] = None,
    numberAttributeConstraints: Option[NumberAttributeConstraints] = None,
    name: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DeveloperOnlyAttribute" -> developerOnlyAttribute.map(Formattable(_)),
    "Mutable" -> mutable.map(Formattable(_)),
    "AttributeDataType" -> attributeDataType.map(Formattable(_)),
    "StringAttributeConstraints" -> stringAttributeConstraints.map(Formattable(_)),
    "Required" -> required.map(Formattable(_)),
    "NumberAttributeConstraints" -> numberAttributeConstraints.map(Formattable(_)),
    "Name" -> name.map(Formattable(_))
  )
}
