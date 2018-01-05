package com.github.mshibuya.cloudformal.aws.codecommit

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html
 */

trait Repository extends Resource {
  val resourceTypeName = "AWS::CodeCommit::Repository"

  def repositoryName: String
  def triggers: Option[Seq[RepositoryTrigger]] = None
  def repositoryDescription: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "RepositoryName" -> Some(Formattable(repositoryName)),
    "Triggers" -> triggers.map(Formattable(_)),
    "RepositoryDescription" -> repositoryDescription.map(Formattable(_))
  )
}
