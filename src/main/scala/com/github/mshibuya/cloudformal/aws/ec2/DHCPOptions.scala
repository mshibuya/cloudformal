package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html
 */

trait DHCPOptions extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::DHCPOptions"

  def domainName: Property[String] = Empty
  def domainNameServers: Property[Seq[String]] = Empty
  def netbiosNameServers: Property[Seq[String]] = Empty
  def netbiosNodeType: Property[Int] = Empty
  def ntpServers: Property[Seq[String]] = Empty
  def tags: Property[Seq[Tag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "DomainName" -> domainName,
    "DomainNameServers" -> domainNameServers,
    "NetbiosNameServers" -> netbiosNameServers,
    "NetbiosNodeType" -> netbiosNodeType,
    "NtpServers" -> ntpServers,
    "Tags" -> tags
  )
}
