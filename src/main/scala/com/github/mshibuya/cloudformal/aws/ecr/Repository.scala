package com.github.mshibuya.cloudformal.aws.ecr

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html
 */

trait Repository extends Resource {
  val resourceTypeName = "AWS::ECR::Repository"

  def lifecyclePolicy: Option[LifecyclePolicy] = None
  def repositoryName: Option[String] = None
  def repositoryPolicyText: Option[Json] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "LifecyclePolicy" -> lifecyclePolicy.map(Formattable(_)),
    "RepositoryName" -> repositoryName.map(Formattable(_)),
    "RepositoryPolicyText" -> repositoryPolicyText.map(Formattable(_))
  )
}
