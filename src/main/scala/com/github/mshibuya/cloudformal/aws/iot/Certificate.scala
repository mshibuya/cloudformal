package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html
 */

trait Certificate extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::IoT::Certificate"

  object attributes {
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def certificateSigningRequest: NonEmptyProperty[String]
  def status: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "CertificateSigningRequest" -> certificateSigningRequest,
    "Status" -> status
  )
}
