package com.github.mshibuya.cloudformal.aws.codecommit

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html
 */

trait Repository extends Resource[Repository] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::CodeCommit::Repository"

  object attributes {
    val cloneUrlHttp: Expression[String] = Fn.GetAtt(logicalId, "CloneUrlHttp")
    val cloneUrlSsh: Expression[String] = Fn.GetAtt(logicalId, "CloneUrlSsh")
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
    val name: Expression[String] = Fn.GetAtt(logicalId, "Name")
  }

  def repositoryName: NonEmptyProperty[String]
  def triggers: Property[Seq[RepositoryTrigger]] = Empty
  def repositoryDescription: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "RepositoryName" -> repositoryName,
    "Triggers" -> triggers,
    "RepositoryDescription" -> repositoryDescription
  )
}
