package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations-associationparameters.html
 */

case class AssociationParameter(
    key: NonEmptyProperty[String],
    value: NonEmptyProperty[Seq[String]]) extends Expression[AssociationParameter] {
  def render: Formattable = Value(
    "Key" -> key,
    "Value" -> value
  )
}
