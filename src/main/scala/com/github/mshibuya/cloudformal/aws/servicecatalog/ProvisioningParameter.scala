package com.github.mshibuya.cloudformal.aws.servicecatalog

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningparameter.html
 */

case class ProvisioningParameter(
    value: Property[String] = Empty,
    key: Property[String] = Empty) extends Expression[ProvisioningParameter] {
  def render: Formattable = Value(
    "Value" -> value,
    "Key" -> key
  )
}
