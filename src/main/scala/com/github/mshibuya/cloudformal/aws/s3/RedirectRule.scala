package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html
 */

case class RedirectRule(
    hostName: Option[String] = None,
    httpRedirectCode: Option[String] = None,
    protocol: Option[String] = None,
    replaceKeyPrefixWith: Option[String] = None,
    replaceKeyWith: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "HostName" -> hostName.map(Formattable(_)),
    "HttpRedirectCode" -> httpRedirectCode.map(Formattable(_)),
    "Protocol" -> protocol.map(Formattable(_)),
    "ReplaceKeyPrefixWith" -> replaceKeyPrefixWith.map(Formattable(_)),
    "ReplaceKeyWith" -> replaceKeyWith.map(Formattable(_))
  )
}
