package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html
 */

trait WebACLAssociation extends Resource {
  val resourceTypeName = "AWS::WAFRegional::WebACLAssociation"

  def resourceArn: NonEmptyProperty[String]
  def webACLId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ResourceArn" -> resourceArn,
    "WebACLId" -> webACLId
  )
}
