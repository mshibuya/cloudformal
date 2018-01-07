package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html
 */

case class SslConfiguration(
    certificate: Property[String] = Empty,
    chain: Property[String] = Empty,
    privateKey: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Certificate" -> certificate,
    "Chain" -> chain,
    "PrivateKey" -> privateKey
  )
}
