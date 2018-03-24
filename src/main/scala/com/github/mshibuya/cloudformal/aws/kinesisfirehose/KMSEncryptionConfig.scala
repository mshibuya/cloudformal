package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html
 */

case class KMSEncryptionConfig(
    awskmsKeyARN: NonEmptyProperty[String]) extends Expression[KMSEncryptionConfig] {
  def render: Formattable = Value(
    "AWSKMSKeyARN" -> awskmsKeyARN
  )
}
