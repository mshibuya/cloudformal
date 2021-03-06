package com.github.mshibuya.cloudformal.aws.ecr

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html
 */

trait Repository extends Resource[Repository] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ECR::Repository"

  object attributes {
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def lifecyclePolicy: Property[LifecyclePolicy] = Empty
  def repositoryName: Property[String] = Empty
  def repositoryPolicyText: Property[Json] = Empty

  def render(): MapValue[_] = Value(
    "LifecyclePolicy" -> lifecyclePolicy,
    "RepositoryName" -> repositoryName,
    "RepositoryPolicyText" -> repositoryPolicyText
  )
}
