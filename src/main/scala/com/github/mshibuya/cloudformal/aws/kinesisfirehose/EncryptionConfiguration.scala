package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html
 */

case class EncryptionConfiguration(
    kMSEncryptionConfig: Option[KMSEncryptionConfig] = None,
    noEncryptionConfig: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "KMSEncryptionConfig" -> kMSEncryptionConfig.map(Formattable(_)),
    "NoEncryptionConfig" -> noEncryptionConfig.map(Formattable(_))
  )
}
