package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html
 */

case class SchemaAttribute(
    developerOnlyAttribute: Property[Boolean] = Empty,
    mutable: Property[Boolean] = Empty,
    attributeDataType: Property[String] = Empty,
    stringAttributeConstraints: Property[StringAttributeConstraints] = Empty,
    required: Property[Boolean] = Empty,
    numberAttributeConstraints: Property[NumberAttributeConstraints] = Empty,
    name: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "DeveloperOnlyAttribute" -> developerOnlyAttribute,
    "Mutable" -> mutable,
    "AttributeDataType" -> attributeDataType,
    "StringAttributeConstraints" -> stringAttributeConstraints,
    "Required" -> required,
    "NumberAttributeConstraints" -> numberAttributeConstraints,
    "Name" -> name
  )
}
