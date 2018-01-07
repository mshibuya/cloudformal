package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html
 */

case class EncryptionConfiguration(
    kMSEncryptionConfig: Property[KMSEncryptionConfig] = Empty,
    noEncryptionConfig: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "KMSEncryptionConfig" -> kMSEncryptionConfig,
    "NoEncryptionConfig" -> noEncryptionConfig
  )
}
