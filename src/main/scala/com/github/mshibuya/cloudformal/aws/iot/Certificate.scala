package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html
 */

trait Certificate extends Resource {
  val resourceTypeName = "AWS::IoT::Certificate"

  def certificateSigningRequest: String
  def status: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "CertificateSigningRequest" -> Some(Formattable(certificateSigningRequest)),
    "Status" -> Some(Formattable(status))
  )
}
