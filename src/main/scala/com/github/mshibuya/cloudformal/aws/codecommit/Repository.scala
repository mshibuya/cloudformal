package com.github.mshibuya.cloudformal.aws.codecommit

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html
 */

trait Repository extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::CodeCommit::Repository"

  def cloneUrlHttpAttribute: Expression[String] = Fn.GetAtt(logicalId, "CloneUrlHttp")
  def cloneUrlSshAttribute: Expression[String] = Fn.GetAtt(logicalId, "CloneUrlSsh")
  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  def nameAttribute: Expression[String] = Fn.GetAtt(logicalId, "Name")

  def repositoryName: NonEmptyProperty[String]
  def triggers: Property[Seq[RepositoryTrigger]] = Empty
  def repositoryDescription: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "RepositoryName" -> repositoryName,
    "Triggers" -> triggers,
    "RepositoryDescription" -> repositoryDescription
  )
}
