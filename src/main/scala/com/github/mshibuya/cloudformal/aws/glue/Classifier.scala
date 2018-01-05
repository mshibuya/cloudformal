package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html
 */

trait Classifier extends Resource {
  val resourceTypeName = "AWS::Glue::Classifier"

  def grokClassifier: Option[GrokClassifier] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "GrokClassifier" -> grokClassifier.map(Formattable(_))
  )
}
