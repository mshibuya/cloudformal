package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html
 */

case class ApplicationVersionLifecycleConfig(
    maxAgeRule: Property[MaxAgeRule] = Empty,
    maxCountRule: Property[MaxCountRule] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "MaxAgeRule" -> maxAgeRule,
    "MaxCountRule" -> maxCountRule
  )
}
