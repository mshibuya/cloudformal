package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html
 */

trait DevEndpoint extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Glue::DevEndpoint"

  def extraJarsS3Path: Property[String] = Empty
  def endpointName: Property[String] = Empty
  def publicKey: NonEmptyProperty[String]
  def numberOfNodes: Property[Int] = Empty
  def subnetId: Property[String] = Empty
  def extraPythonLibsS3Path: Property[String] = Empty
  def securityGroupIds: Property[Seq[String]] = Empty
  def roleArn: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ExtraJarsS3Path" -> extraJarsS3Path,
    "EndpointName" -> endpointName,
    "PublicKey" -> publicKey,
    "NumberOfNodes" -> numberOfNodes,
    "SubnetId" -> subnetId,
    "ExtraPythonLibsS3Path" -> extraPythonLibsS3Path,
    "SecurityGroupIds" -> securityGroupIds,
    "RoleArn" -> roleArn
  )
}
