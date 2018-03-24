package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html
 */

trait ReceiptFilter extends Resource[ReceiptFilter] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::SES::ReceiptFilter"

  def filter: NonEmptyProperty[Filter]

  def render(): MapValue[_] = Value(
    "Filter" -> filter
  )
}
