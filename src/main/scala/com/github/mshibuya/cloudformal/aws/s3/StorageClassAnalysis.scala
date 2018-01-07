package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-storageclassanalysis.html
 */

case class StorageClassAnalysis(
    dataExport: Property[DataExport] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "DataExport" -> dataExport
  )
}
