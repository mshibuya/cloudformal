package com.github.mshibuya.cloudformal.aws.sdb

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-simpledb.html
 */

trait Domain extends Resource {
  val resourceTypeName = "AWS::SDB::Domain"

  def description: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> description.map(Formattable(_))
  )
}
