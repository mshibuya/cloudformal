package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html
 */

trait DeploymentConfig extends Resource {
  val resourceTypeName = "AWS::CodeDeploy::DeploymentConfig"

  def deploymentConfigName: Option[String] = None
  def minimumHealthyHosts: Option[MinimumHealthyHosts] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "DeploymentConfigName" -> deploymentConfigName.map(Formattable(_)),
    "MinimumHealthyHosts" -> minimumHealthyHosts.map(Formattable(_))
  )
}
