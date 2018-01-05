package com.github.mshibuya.cloudformal.aws.iam

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html
 */

trait UserToGroupAddition extends Resource {
  val resourceTypeName = "AWS::IAM::UserToGroupAddition"

  def groupName: String
  def users: Seq[String]

  def resourceProperties: FormattableMap = Formattable.opt(
    "GroupName" -> Some(Formattable(groupName)),
    "Users" -> Some(Formattable(users))
  )
}
