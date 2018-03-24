package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html
 */

case class SslConfiguration(
    certificate: Property[String] = Empty,
    chain: Property[String] = Empty,
    privateKey: Property[String] = Empty) extends Expression[SslConfiguration] {
  def render: Formattable = Value(
    "Certificate" -> certificate,
    "Chain" -> chain,
    "PrivateKey" -> privateKey
  )
}
