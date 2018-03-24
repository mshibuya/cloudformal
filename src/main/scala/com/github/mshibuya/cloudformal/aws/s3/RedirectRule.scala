package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html
 */

case class RedirectRule(
    hostName: Property[String] = Empty,
    httpRedirectCode: Property[String] = Empty,
    protocol: Property[String] = Empty,
    replaceKeyPrefixWith: Property[String] = Empty,
    replaceKeyWith: Property[String] = Empty) extends Expression[RedirectRule] {
  def render: Formattable = Value(
    "HostName" -> hostName,
    "HttpRedirectCode" -> httpRedirectCode,
    "Protocol" -> protocol,
    "ReplaceKeyPrefixWith" -> replaceKeyPrefixWith,
    "ReplaceKeyWith" -> replaceKeyWith
  )
}
