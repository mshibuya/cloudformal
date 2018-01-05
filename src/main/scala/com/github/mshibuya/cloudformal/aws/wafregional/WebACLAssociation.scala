package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html
 */

trait WebACLAssociation extends Resource {
  val resourceTypeName = "AWS::WAFRegional::WebACLAssociation"

  def resourceArn: String
  def webACLId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "ResourceArn" -> Some(Formattable(resourceArn)),
    "WebACLId" -> Some(Formattable(webACLId))
  )
}
