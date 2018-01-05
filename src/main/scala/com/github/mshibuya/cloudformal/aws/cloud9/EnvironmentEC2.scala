package com.github.mshibuya.cloudformal.aws.cloud9

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html
 */

trait EnvironmentEC2 extends Resource {
  val resourceTypeName = "AWS::Cloud9::EnvironmentEC2"

  def repositories: Option[Seq[Repository]] = None
  def ownerArn: Option[String] = None
  def description: Option[String] = None
  def automaticStopTimeMinutes: Option[Int] = None
  def subnetId: Option[String] = None
  def instanceType: String
  def name: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Repositories" -> repositories.map(Formattable(_)),
    "OwnerArn" -> ownerArn.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "AutomaticStopTimeMinutes" -> automaticStopTimeMinutes.map(Formattable(_)),
    "SubnetId" -> subnetId.map(Formattable(_)),
    "InstanceType" -> Some(Formattable(instanceType)),
    "Name" -> name.map(Formattable(_))
  )
}
