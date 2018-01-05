package com.github.mshibuya.cloudformal.aws.certificatemanager

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html
 */

trait Certificate extends Resource {
  val resourceTypeName = "AWS::CertificateManager::Certificate"

  def domainName: String
  def domainValidationOptions: Option[Seq[DomainValidationOption]] = None
  def subjectAlternativeNames: Option[Seq[String]] = None
  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "DomainName" -> Some(Formattable(domainName)),
    "DomainValidationOptions" -> domainValidationOptions.map(Formattable(_)),
    "SubjectAlternativeNames" -> subjectAlternativeNames.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_))
  )
}
