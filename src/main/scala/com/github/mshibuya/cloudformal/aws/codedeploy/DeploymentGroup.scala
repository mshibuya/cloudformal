package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html
 */

trait DeploymentGroup extends Resource {
  val resourceTypeName = "AWS::CodeDeploy::DeploymentGroup"

  def alarmConfiguration: Option[AlarmConfiguration] = None
  def applicationName: String
  def autoRollbackConfiguration: Option[AutoRollbackConfiguration] = None
  def autoScalingGroups: Option[Seq[String]] = None
  def deployment: Option[Deployment] = None
  def deploymentConfigName: Option[String] = None
  def deploymentGroupName: Option[String] = None
  def deploymentStyle: Option[DeploymentStyle] = None
  def ec2TagFilters: Option[Seq[EC2TagFilter]] = None
  def loadBalancerInfo: Option[LoadBalancerInfo] = None
  def onPremisesInstanceTagFilters: Option[Seq[TagFilter]] = None
  def serviceRoleArn: String
  def triggerConfigurations: Option[Seq[TriggerConfig]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AlarmConfiguration" -> alarmConfiguration.map(Formattable(_)),
    "ApplicationName" -> Some(Formattable(applicationName)),
    "AutoRollbackConfiguration" -> autoRollbackConfiguration.map(Formattable(_)),
    "AutoScalingGroups" -> autoScalingGroups.map(Formattable(_)),
    "Deployment" -> deployment.map(Formattable(_)),
    "DeploymentConfigName" -> deploymentConfigName.map(Formattable(_)),
    "DeploymentGroupName" -> deploymentGroupName.map(Formattable(_)),
    "DeploymentStyle" -> deploymentStyle.map(Formattable(_)),
    "Ec2TagFilters" -> ec2TagFilters.map(Formattable(_)),
    "LoadBalancerInfo" -> loadBalancerInfo.map(Formattable(_)),
    "OnPremisesInstanceTagFilters" -> onPremisesInstanceTagFilters.map(Formattable(_)),
    "ServiceRoleArn" -> Some(Formattable(serviceRoleArn)),
    "TriggerConfigurations" -> triggerConfigurations.map(Formattable(_))
  )
}
