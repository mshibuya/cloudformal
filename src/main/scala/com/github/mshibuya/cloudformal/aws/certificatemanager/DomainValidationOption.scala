package com.github.mshibuya.cloudformal.aws.certificatemanager

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html
 */

case class DomainValidationOption(
    domainName: String,
    validationDomain: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DomainName" -> Some(Formattable(domainName)),
    "ValidationDomain" -> Some(Formattable(validationDomain))
  )
}
