package com.github.mshibuya.cloudformal.aws.emr

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html
 */

trait SecurityConfiguration extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EMR::SecurityConfiguration"

  def name: Property[String] = Empty
  def securityConfiguration: NonEmptyProperty[Json]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Name" -> name,
    "SecurityConfiguration" -> securityConfiguration
  )
}
