package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html
 */

case class AliasRoutingConfiguration(
    additionalVersionWeights: NonEmptyProperty[Seq[VersionWeight]]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "AdditionalVersionWeights" -> additionalVersionWeights
  )
}
