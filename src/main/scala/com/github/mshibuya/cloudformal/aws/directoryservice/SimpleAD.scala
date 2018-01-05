package com.github.mshibuya.cloudformal.aws.directoryservice

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html
 */

trait SimpleAD extends Resource {
  val resourceTypeName = "AWS::DirectoryService::SimpleAD"

  def createAlias: Option[Boolean] = None
  def description: Option[String] = None
  def enableSso: Option[Boolean] = None
  def name: String
  def password: String
  def shortName: Option[String] = None
  def size: String
  def vpcSettings: VpcSettings

  def resourceProperties: FormattableMap = Formattable.opt(
    "CreateAlias" -> createAlias.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "EnableSso" -> enableSso.map(Formattable(_)),
    "Name" -> Some(Formattable(name)),
    "Password" -> Some(Formattable(password)),
    "ShortName" -> shortName.map(Formattable(_)),
    "Size" -> Some(Formattable(size)),
    "VpcSettings" -> Some(Formattable(vpcSettings))
  )
}
