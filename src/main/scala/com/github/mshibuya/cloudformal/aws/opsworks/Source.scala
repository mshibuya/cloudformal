package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html
 */

case class Source(
    password: Property[String] = Empty,
    revision: Property[String] = Empty,
    sshKey: Property[String] = Empty,
    `type`: Property[String] = Empty,
    url: Property[String] = Empty,
    username: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Password" -> password,
    "Revision" -> revision,
    "SshKey" -> sshKey,
    "Type" -> `type`,
    "Url" -> url,
    "Username" -> username
  )
}
