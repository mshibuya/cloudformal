package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html
 */

trait DHCPOptions extends Resource {
  val resourceTypeName = "AWS::EC2::DHCPOptions"

  def domainName: Option[String] = None
  def domainNameServers: Option[Seq[String]] = None
  def netbiosNameServers: Option[Seq[String]] = None
  def netbiosNodeType: Option[Int] = None
  def ntpServers: Option[Seq[String]] = None
  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "DomainName" -> domainName.map(Formattable(_)),
    "DomainNameServers" -> domainNameServers.map(Formattable(_)),
    "NetbiosNameServers" -> netbiosNameServers.map(Formattable(_)),
    "NetbiosNodeType" -> netbiosNodeType.map(Formattable(_)),
    "NtpServers" -> ntpServers.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_))
  )
}
