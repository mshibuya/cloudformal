package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html
 */

trait ReceiptRuleSet extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::SES::ReceiptRuleSet"

  def ruleSetName: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "RuleSetName" -> ruleSetName
  )
}
