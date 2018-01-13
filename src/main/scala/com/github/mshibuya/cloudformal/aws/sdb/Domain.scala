package com.github.mshibuya.cloudformal.aws.sdb

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-simpledb.html
 */

trait Domain extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::SDB::Domain"

  def description: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Description" -> description
  )
}
