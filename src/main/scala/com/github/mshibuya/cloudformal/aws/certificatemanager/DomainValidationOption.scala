package com.github.mshibuya.cloudformal.aws.certificatemanager

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html
 */

case class DomainValidationOption(
    domainName: NonEmptyProperty[String],
    validationDomain: NonEmptyProperty[String]) extends Expression[DomainValidationOption] {
  def render: Formattable = Value(
    "DomainName" -> domainName,
    "ValidationDomain" -> validationDomain
  )
}
