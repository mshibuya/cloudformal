package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html
 */

trait HealthCheck extends Resource {
  val resourceTypeName = "AWS::Route53::HealthCheck"

  def healthCheckConfig: NonEmptyProperty[HealthCheckConfig]
  def healthCheckTags: Property[Seq[HealthCheckTag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "HealthCheckConfig" -> healthCheckConfig,
    "HealthCheckTags" -> healthCheckTags
  )
}
