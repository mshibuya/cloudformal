package com.github.mshibuya.cloudformal.aws.certificatemanager

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html
 */

trait Certificate extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::CertificateManager::Certificate"

  def domainName: NonEmptyProperty[String]
  def domainValidationOptions: Property[Seq[DomainValidationOption]] = Empty
  def subjectAlternativeNames: Property[Seq[String]] = Empty
  def tags: Property[Seq[Tag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "DomainName" -> domainName,
    "DomainValidationOptions" -> domainValidationOptions,
    "SubjectAlternativeNames" -> subjectAlternativeNames,
    "Tags" -> tags
  )
}
