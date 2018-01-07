package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html
 */

case class KMSEncryptionConfig(
    aWSKMSKeyARN: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "AWSKMSKeyARN" -> aWSKMSKeyARN
  )
}
