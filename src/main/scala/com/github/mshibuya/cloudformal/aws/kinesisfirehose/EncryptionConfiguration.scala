package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html
 */

case class EncryptionConfiguration(
    kmsEncryptionConfig: Property[KMSEncryptionConfig] = Empty,
    noEncryptionConfig: Property[String] = Empty) extends Expression[EncryptionConfiguration] {
  def render: Formattable = Value(
    "KMSEncryptionConfig" -> kmsEncryptionConfig,
    "NoEncryptionConfig" -> noEncryptionConfig
  )
}
