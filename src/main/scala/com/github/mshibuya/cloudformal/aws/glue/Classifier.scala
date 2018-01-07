package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html
 */

trait Classifier extends Resource {
  val resourceTypeName = "AWS::Glue::Classifier"

  def grokClassifier: Property[GrokClassifier] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "GrokClassifier" -> grokClassifier
  )
}
