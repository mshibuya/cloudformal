package com.github.mshibuya.cloudformal.aws.ecr

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html
 */

trait Repository extends Resource {
  val resourceTypeName = "AWS::ECR::Repository"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def lifecyclePolicy: Property[LifecyclePolicy] = Empty
  def repositoryName: Property[String] = Empty
  def repositoryPolicyText: Property[Json] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "LifecyclePolicy" -> lifecyclePolicy,
    "RepositoryName" -> repositoryName,
    "RepositoryPolicyText" -> repositoryPolicyText
  )
}
