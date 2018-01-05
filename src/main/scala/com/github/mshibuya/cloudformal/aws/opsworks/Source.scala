package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html
 */

case class Source(
    password: Option[String] = None,
    revision: Option[String] = None,
    sshKey: Option[String] = None,
    `type`: Option[String] = None,
    url: Option[String] = None,
    username: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Password" -> password.map(Formattable(_)),
    "Revision" -> revision.map(Formattable(_)),
    "SshKey" -> sshKey.map(Formattable(_)),
    "Type" -> `type`.map(Formattable(_)),
    "Url" -> url.map(Formattable(_)),
    "Username" -> username.map(Formattable(_))
  )
}
