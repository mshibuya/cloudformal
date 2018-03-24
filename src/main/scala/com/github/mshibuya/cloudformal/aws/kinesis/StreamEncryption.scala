package com.github.mshibuya.cloudformal.aws.kinesis

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html
 */

case class StreamEncryption(
    encryptionType: NonEmptyProperty[String],
    keyId: NonEmptyProperty[String]) extends Expression[StreamEncryption] {
  def render: Formattable = Value(
    "EncryptionType" -> encryptionType,
    "KeyId" -> keyId
  )
}
