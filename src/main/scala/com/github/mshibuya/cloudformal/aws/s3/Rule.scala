package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html
 */

case class Rule(
    abortIncompleteMultipartUpload: Option[AbortIncompleteMultipartUpload] = None,
    expirationDate: Option[java.time.ZonedDateTime] = None,
    expirationInDays: Option[Int] = None,
    id: Option[String] = None,
    noncurrentVersionExpirationInDays: Option[Int] = None,
    noncurrentVersionTransition: Option[NoncurrentVersionTransition] = None,
    noncurrentVersionTransitions: Option[Seq[NoncurrentVersionTransition]] = None,
    prefix: Option[String] = None,
    status: String,
    tagFilters: Option[Seq[TagFilter]] = None,
    transition: Option[Transition] = None,
    transitions: Option[Seq[Transition]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AbortIncompleteMultipartUpload" -> abortIncompleteMultipartUpload.map(Formattable(_)),
    "ExpirationDate" -> expirationDate.map(Formattable(_)),
    "ExpirationInDays" -> expirationInDays.map(Formattable(_)),
    "Id" -> id.map(Formattable(_)),
    "NoncurrentVersionExpirationInDays" -> noncurrentVersionExpirationInDays.map(Formattable(_)),
    "NoncurrentVersionTransition" -> noncurrentVersionTransition.map(Formattable(_)),
    "NoncurrentVersionTransitions" -> noncurrentVersionTransitions.map(Formattable(_)),
    "Prefix" -> prefix.map(Formattable(_)),
    "Status" -> Some(Formattable(status)),
    "TagFilters" -> tagFilters.map(Formattable(_)),
    "Transition" -> transition.map(Formattable(_)),
    "Transitions" -> transitions.map(Formattable(_))
  )
}
