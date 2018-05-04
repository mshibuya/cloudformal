package com.github.mshibuya.cloudformal.command

import java.io.File

import com.amazonaws.auth.profile.ProfileCredentialsProvider
import com.amazonaws.auth.{AWSCredentialsProvider, DefaultAWSCredentialsProviderChain}
import com.amazonaws.services.cloudformation.{AmazonCloudFormation, AmazonCloudFormationClientBuilder}

import scala.util.Properties

case class Config(profile: Option[String] = None,
                  region: Option[String] = None,
                  command: Option[Command] = None,
                  stackName: Option[String] = None,
                  output: Option[File] = None) {
  lazy val credentialsProvider: AWSCredentialsProvider = profile
    .fold[AWSCredentialsProvider](DefaultAWSCredentialsProviderChain.getInstance())
    { profile => new ProfileCredentialsProvider(profile) }

  lazy val cloudFormationClient: AmazonCloudFormation = {
    val builder = AmazonCloudFormationClientBuilder.standard().withCredentials(credentialsProvider)
    region
      .orElse(Properties.envOrNone("AWS_REGION"))
      // AWS Java SDK does not handle AWS_DEFAULT_REGION, so set it manually
      .orElse(Properties.envOrNone("AWS_DEFAULT_REGION"))
      .foreach(builder.setRegion)
    builder.build()
  }
}