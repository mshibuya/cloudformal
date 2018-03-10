package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html
 */

trait ConfigurationSet extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::SES::ConfigurationSet"

  def name: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Name" -> name
  )
}
