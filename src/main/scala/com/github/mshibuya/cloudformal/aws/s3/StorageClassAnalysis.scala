package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-storageclassanalysis.html
 */

case class StorageClassAnalysis(
    dataExport: Option[DataExport] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DataExport" -> dataExport.map(Formattable(_))
  )
}
