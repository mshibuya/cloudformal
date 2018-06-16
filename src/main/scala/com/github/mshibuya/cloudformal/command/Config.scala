package com.github.mshibuya.cloudformal.command

import java.io.File

import com.amazonaws.auth.profile.ProfileCredentialsProvider
import com.amazonaws.auth.{AWSCredentialsProvider, DefaultAWSCredentialsProviderChain}
import com.amazonaws.services.cloudformation.model.{Parameter, Tag}
import com.amazonaws.services.cloudformation.{AmazonCloudFormation, AmazonCloudFormationClientBuilder}

import scala.util.Properties

case class Config(profile: Option[String] = None,
                  regionParam: Option[String] = None,
                  force: Boolean = false,
                  command: Option[Command] = None,
                  rawParameters: Option[String] = None,
                  rawTags: Option[String] = None,
                  noChangeSet: Boolean = false,
                  diffBackendParam: Option[String] = None,
                  stackName: Option[String] = None,
                  output: Option[File] = None) {
  lazy val credentialsProvider: AWSCredentialsProvider = profile
    .fold[AWSCredentialsProvider](DefaultAWSCredentialsProviderChain.getInstance())
    { profile => new ProfileCredentialsProvider(profile) }

  lazy val region: String = regionParam
    .orElse(Properties.envOrNone("AWS_REGION"))
    // AWS Java SDK does not handle AWS_DEFAULT_REGION, so set it manually
    .orElse(Properties.envOrNone("AWS_DEFAULT_REGION"))
    .getOrElse("")

  lazy val cloudFormationClient: AmazonCloudFormation = {
    val builder = AmazonCloudFormationClientBuilder.standard().withCredentials(credentialsProvider)
    builder.setRegion(region)
    builder.build()
  }

  lazy val parameters: Seq[Parameter] = rawParameters.map { raw =>
    raw.split(",").toSeq.map { pair =>
      pair.split("=", 2).toSeq match {
        case Seq(key, value) => new Parameter().withParameterKey(key).withParameterValue(value)
        case _ => throw new IllegalArgumentException(s"Could not parse parameter: $pair")
      }
    }
  }.getOrElse(Nil)

  lazy val tags: Seq[Tag] = rawParameters.map { raw =>
    raw.split(",").toSeq.map { pair =>
      pair.split("=", 2).toSeq match {
        case Seq(key, value) => new Tag().withKey(key).withValue(value)
        case _ => throw new IllegalArgumentException(s"Could not parse tag: $pair")
      }
    }
  }.getOrElse(Nil)

  lazy val diffBackend: String = diffBackendParam.getOrElse("git diff --no-index --color=always")
}