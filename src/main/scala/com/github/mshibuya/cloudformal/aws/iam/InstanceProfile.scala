package com.github.mshibuya.cloudformal.aws.iam

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html
 */

trait InstanceProfile extends Resource {
  val resourceTypeName = "AWS::IAM::InstanceProfile"

  def instanceProfileName: Option[String] = None
  def path: Option[String] = None
  def roles: Seq[String]

  def resourceProperties: FormattableMap = Formattable.opt(
    "InstanceProfileName" -> instanceProfileName.map(Formattable(_)),
    "Path" -> path.map(Formattable(_)),
    "Roles" -> Some(Formattable(roles))
  )
}
