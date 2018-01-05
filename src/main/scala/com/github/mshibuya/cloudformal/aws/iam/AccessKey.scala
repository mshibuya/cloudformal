package com.github.mshibuya.cloudformal.aws.iam

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html
 */

trait AccessKey extends Resource {
  val resourceTypeName = "AWS::IAM::AccessKey"

  def serial: Option[Int] = None
  def status: Option[String] = None
  def userName: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "Serial" -> serial.map(Formattable(_)),
    "Status" -> status.map(Formattable(_)),
    "UserName" -> Some(Formattable(userName))
  )
}
