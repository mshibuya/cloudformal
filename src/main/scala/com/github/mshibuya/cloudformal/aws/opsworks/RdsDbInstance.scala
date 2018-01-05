package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html
 */

case class RdsDbInstance(
    dbPassword: String,
    dbUser: String,
    rdsDbInstanceArn: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DbPassword" -> Some(Formattable(dbPassword)),
    "DbUser" -> Some(Formattable(dbUser)),
    "RdsDbInstanceArn" -> Some(Formattable(rdsDbInstanceArn))
  )
}
