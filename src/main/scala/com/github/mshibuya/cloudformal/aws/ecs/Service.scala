package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html
 */

trait Service extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ECS::Service"

  def nameAttribute: Expression[String] = Fn.GetAtt(logicalId, "Name")

  def cluster: Property[String] = Empty
  def deploymentConfiguration: Property[DeploymentConfiguration] = Empty
  def desiredCount: Property[Int] = Empty
  def healthCheckGracePeriodSeconds: Property[Int] = Empty
  def launchType: Property[String] = Empty
  def loadBalancers: Property[Seq[LoadBalancer]] = Empty
  def networkConfiguration: Property[NetworkConfiguration] = Empty
  def placementConstraints: Property[Seq[PlacementConstraint]] = Empty
  def placementStrategies: Property[Seq[PlacementStrategy]] = Empty
  def platformVersion: Property[String] = Empty
  def role: Property[String] = Empty
  def serviceName: Property[String] = Empty
  def taskDefinition: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Cluster" -> cluster,
    "DeploymentConfiguration" -> deploymentConfiguration,
    "DesiredCount" -> desiredCount,
    "HealthCheckGracePeriodSeconds" -> healthCheckGracePeriodSeconds,
    "LaunchType" -> launchType,
    "LoadBalancers" -> loadBalancers,
    "NetworkConfiguration" -> networkConfiguration,
    "PlacementConstraints" -> placementConstraints,
    "PlacementStrategies" -> placementStrategies,
    "PlatformVersion" -> platformVersion,
    "Role" -> role,
    "ServiceName" -> serviceName,
    "TaskDefinition" -> taskDefinition
  )
}
