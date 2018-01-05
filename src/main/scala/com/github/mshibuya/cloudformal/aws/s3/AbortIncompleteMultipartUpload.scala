package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html
 */

case class AbortIncompleteMultipartUpload(
    daysAfterInitiation: Int) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DaysAfterInitiation" -> Some(Formattable(daysAfterInitiation))
  )
}
