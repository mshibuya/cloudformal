package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html
 */

case class RdsDbInstance(
    dbPassword: NonEmptyProperty[String],
    dbUser: NonEmptyProperty[String],
    rdsDbInstanceArn: NonEmptyProperty[String]) extends Expression[RdsDbInstance] {
  def render: Formattable = Value(
    "DbPassword" -> dbPassword,
    "DbUser" -> dbUser,
    "RdsDbInstanceArn" -> rdsDbInstanceArn
  )
}
