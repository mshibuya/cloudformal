package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html
 */

trait DeploymentGroup extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::CodeDeploy::DeploymentGroup"

  def alarmConfiguration: Property[AlarmConfiguration] = Empty
  def applicationName: NonEmptyProperty[String]
  def autoRollbackConfiguration: Property[AutoRollbackConfiguration] = Empty
  def autoScalingGroups: Property[Seq[String]] = Empty
  def deployment: Property[Deployment] = Empty
  def deploymentConfigName: Property[String] = Empty
  def deploymentGroupName: Property[String] = Empty
  def deploymentStyle: Property[DeploymentStyle] = Empty
  def ec2TagFilters: Property[Seq[EC2TagFilter]] = Empty
  def loadBalancerInfo: Property[LoadBalancerInfo] = Empty
  def onPremisesInstanceTagFilters: Property[Seq[TagFilter]] = Empty
  def serviceRoleArn: NonEmptyProperty[String]
  def triggerConfigurations: Property[Seq[TriggerConfig]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AlarmConfiguration" -> alarmConfiguration,
    "ApplicationName" -> applicationName,
    "AutoRollbackConfiguration" -> autoRollbackConfiguration,
    "AutoScalingGroups" -> autoScalingGroups,
    "Deployment" -> deployment,
    "DeploymentConfigName" -> deploymentConfigName,
    "DeploymentGroupName" -> deploymentGroupName,
    "DeploymentStyle" -> deploymentStyle,
    "Ec2TagFilters" -> ec2TagFilters,
    "LoadBalancerInfo" -> loadBalancerInfo,
    "OnPremisesInstanceTagFilters" -> onPremisesInstanceTagFilters,
    "ServiceRoleArn" -> serviceRoleArn,
    "TriggerConfigurations" -> triggerConfigurations
  )
}
