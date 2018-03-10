package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html
 */

trait ReceiptRule extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::SES::ReceiptRule"

  def after: Property[String] = Empty
  def rule: NonEmptyProperty[Rule]
  def ruleSetName: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "After" -> after,
    "Rule" -> rule,
    "RuleSetName" -> ruleSetName
  )
}
