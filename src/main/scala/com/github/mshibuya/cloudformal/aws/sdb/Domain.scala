package com.github.mshibuya.cloudformal.aws.sdb

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-simpledb.html
 */

trait Domain extends Resource[Domain] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::SDB::Domain"

  def description: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "Description" -> description
  )
}
