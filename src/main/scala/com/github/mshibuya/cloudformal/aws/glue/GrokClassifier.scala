package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html
 */

case class GrokClassifier(
    customPatterns: Property[String] = Empty,
    grokPattern: NonEmptyProperty[String],
    classification: NonEmptyProperty[String],
    name: Property[String] = Empty) extends Expression[GrokClassifier] {
  def render: Formattable = Value(
    "CustomPatterns" -> customPatterns,
    "GrokPattern" -> grokPattern,
    "Classification" -> classification,
    "Name" -> name
  )
}
