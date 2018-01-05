package com.github.mshibuya.cloudformal.aws.dax

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html
 */

trait SubnetGroup extends Resource {
  val resourceTypeName = "AWS::DAX::SubnetGroup"

  def description: Option[String] = None
  def subnetGroupName: Option[String] = None
  def subnetIds: Seq[String]

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> description.map(Formattable(_)),
    "SubnetGroupName" -> subnetGroupName.map(Formattable(_)),
    "SubnetIds" -> Some(Formattable(subnetIds))
  )
}
