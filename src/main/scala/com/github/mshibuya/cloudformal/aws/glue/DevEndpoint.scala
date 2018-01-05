package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html
 */

trait DevEndpoint extends Resource {
  val resourceTypeName = "AWS::Glue::DevEndpoint"

  def extraJarsS3Path: Option[String] = None
  def endpointName: Option[String] = None
  def publicKey: String
  def numberOfNodes: Option[Int] = None
  def subnetId: Option[String] = None
  def extraPythonLibsS3Path: Option[String] = None
  def securityGroupIds: Option[Seq[String]] = None
  def roleArn: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "ExtraJarsS3Path" -> extraJarsS3Path.map(Formattable(_)),
    "EndpointName" -> endpointName.map(Formattable(_)),
    "PublicKey" -> Some(Formattable(publicKey)),
    "NumberOfNodes" -> numberOfNodes.map(Formattable(_)),
    "SubnetId" -> subnetId.map(Formattable(_)),
    "ExtraPythonLibsS3Path" -> extraPythonLibsS3Path.map(Formattable(_)),
    "SecurityGroupIds" -> securityGroupIds.map(Formattable(_)),
    "RoleArn" -> Some(Formattable(roleArn))
  )
}
