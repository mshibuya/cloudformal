package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html
 */

trait HealthCheck extends Resource {
  val resourceTypeName = "AWS::Route53::HealthCheck"

  def healthCheckConfig: HealthCheckConfig
  def healthCheckTags: Option[Seq[HealthCheckTag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "HealthCheckConfig" -> Some(Formattable(healthCheckConfig)),
    "HealthCheckTags" -> healthCheckTags.map(Formattable(_))
  )
}
