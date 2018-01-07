package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html
 */

case class SsmAssociation(
    associationParameters: Property[Seq[AssociationParameter]] = Empty,
    documentName: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "AssociationParameters" -> associationParameters,
    "DocumentName" -> documentName
  )
}
