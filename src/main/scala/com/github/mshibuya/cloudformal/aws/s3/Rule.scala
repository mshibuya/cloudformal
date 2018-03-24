package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html
 */

case class Rule(
    abortIncompleteMultipartUpload: Property[AbortIncompleteMultipartUpload] = Empty,
    expirationDate: Property[java.time.ZonedDateTime] = Empty,
    expirationInDays: Property[Int] = Empty,
    id: Property[String] = Empty,
    noncurrentVersionExpirationInDays: Property[Int] = Empty,
    noncurrentVersionTransition: Property[NoncurrentVersionTransition] = Empty,
    noncurrentVersionTransitions: Property[Seq[NoncurrentVersionTransition]] = Empty,
    prefix: Property[String] = Empty,
    status: NonEmptyProperty[String],
    tagFilters: Property[Seq[TagFilter]] = Empty,
    transition: Property[Transition] = Empty,
    transitions: Property[Seq[Transition]] = Empty) extends Expression[Rule] {
  def render: Formattable = Value(
    "AbortIncompleteMultipartUpload" -> abortIncompleteMultipartUpload,
    "ExpirationDate" -> expirationDate,
    "ExpirationInDays" -> expirationInDays,
    "Id" -> id,
    "NoncurrentVersionExpirationInDays" -> noncurrentVersionExpirationInDays,
    "NoncurrentVersionTransition" -> noncurrentVersionTransition,
    "NoncurrentVersionTransitions" -> noncurrentVersionTransitions,
    "Prefix" -> prefix,
    "Status" -> status,
    "TagFilters" -> tagFilters,
    "Transition" -> transition,
    "Transitions" -> transitions
  )
}
