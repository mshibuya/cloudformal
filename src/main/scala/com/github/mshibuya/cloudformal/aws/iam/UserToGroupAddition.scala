package com.github.mshibuya.cloudformal.aws.iam

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html
 */

trait UserToGroupAddition extends Resource {
  val resourceTypeName = "AWS::IAM::UserToGroupAddition"

  def groupName: NonEmptyProperty[String]
  def users: NonEmptyProperty[Seq[String]]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "GroupName" -> groupName,
    "Users" -> users
  )
}
