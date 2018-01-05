package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html
 */

case class SslConfiguration(
    certificate: Option[String] = None,
    chain: Option[String] = None,
    privateKey: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Certificate" -> certificate.map(Formattable(_)),
    "Chain" -> chain.map(Formattable(_)),
    "PrivateKey" -> privateKey.map(Formattable(_))
  )
}
