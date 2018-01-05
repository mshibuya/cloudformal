package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html
 */

case class ApplicationVersionLifecycleConfig(
    maxAgeRule: Option[MaxAgeRule] = None,
    maxCountRule: Option[MaxCountRule] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "MaxAgeRule" -> maxAgeRule.map(Formattable(_)),
    "MaxCountRule" -> maxCountRule.map(Formattable(_))
  )
}
