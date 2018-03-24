package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html
 */

trait DeploymentConfig extends Resource[DeploymentConfig] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::CodeDeploy::DeploymentConfig"

  def deploymentConfigName: Property[String] = Empty
  def minimumHealthyHosts: Property[MinimumHealthyHosts] = Empty

  def render(): MapValue[_] = Value(
    "DeploymentConfigName" -> deploymentConfigName,
    "MinimumHealthyHosts" -> minimumHealthyHosts
  )
}
