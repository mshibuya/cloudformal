package com.github.mshibuya.cloudformal.aws.directoryservice

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html
 */

trait MicrosoftAD extends Resource {
  val resourceTypeName = "AWS::DirectoryService::MicrosoftAD"

  def createAlias: Option[Boolean] = None
  def enableSso: Option[Boolean] = None
  def name: String
  def password: String
  def shortName: Option[String] = None
  def vpcSettings: VpcSettings

  def resourceProperties: FormattableMap = Formattable.opt(
    "CreateAlias" -> createAlias.map(Formattable(_)),
    "EnableSso" -> enableSso.map(Formattable(_)),
    "Name" -> Some(Formattable(name)),
    "Password" -> Some(Formattable(password)),
    "ShortName" -> shortName.map(Formattable(_)),
    "VpcSettings" -> Some(Formattable(vpcSettings))
  )
}
