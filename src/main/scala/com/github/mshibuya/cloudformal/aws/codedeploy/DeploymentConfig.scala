package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html
 */

trait DeploymentConfig extends Resource {
  val resourceTypeName = "AWS::CodeDeploy::DeploymentConfig"

  def deploymentConfigName: Property[String] = Empty
  def minimumHealthyHosts: Property[MinimumHealthyHosts] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "DeploymentConfigName" -> deploymentConfigName,
    "MinimumHealthyHosts" -> minimumHealthyHosts
  )
}
