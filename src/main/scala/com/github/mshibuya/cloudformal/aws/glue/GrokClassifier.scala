package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html
 */

case class GrokClassifier(
    customPatterns: Option[String] = None,
    grokPattern: String,
    classification: String,
    name: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "CustomPatterns" -> customPatterns.map(Formattable(_)),
    "GrokPattern" -> Some(Formattable(grokPattern)),
    "Classification" -> Some(Formattable(classification)),
    "Name" -> name.map(Formattable(_))
  )
}
