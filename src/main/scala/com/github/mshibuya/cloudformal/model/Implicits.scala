package com.github.mshibuya.cloudformal.model

import java.time.ZonedDateTime

import argonaut.Json

import scala.collection.immutable.ListMap
import scala.language.implicitConversions

object Implicits {
  implicit def booleanToValue(value: Boolean): Value[Boolean] = BooleanValue(value)
  implicit def intToValue(value: Int): Value[Int] = IntValue(value)
  implicit def longToValue(value: Long): Value[Long] = LongValue(value)
  implicit def doubleToValue(value: Double): Value[Double] = DoubleValue(value)
  implicit def stringToValue(value: String): Value[String] = StringValue(value)
  implicit def jsonToValue(value: Json): Value[Json] = JsonValue(value)
  implicit def zonedDateTimeToValue(value: ZonedDateTime): Value[ZonedDateTime] = TimestampValue(value)
  implicit def seqToValue[A](value: Seq[A])(implicit f: A => Property[A]): Value[Seq[A]] = SeqValue(value.map(f))
  implicit def seqPropertyToValue[A](value: Seq[Property[A]]): Value[Seq[A]] = SeqValue(value)
  implicit def mapToValue[A](value: Map[String, A])(implicit f: A => Property[A]): Value[Map[String, A]] = MapValue(ListMap(value.toSeq.collect {
    case (k, v) => k -> f(v)
  }: _*))
  implicit def mapPropertyToValue[A](value: Map[String, Property[A]]): Value[Map[String, A]] = MapValue(ListMap(value.toSeq: _*))
  implicit def listMapToValue[A](value: ListMap[String, A])(implicit f: A => Property[A]): Value[ListMap[String, A]] = MapValue(ListMap(value.toSeq.collect {
    case (k, v) => k -> f(v)
  }: _*))
  implicit def listMapPropertyToValue[A](value: ListMap[String, Property[A]]): Value[Map[String, A]] = MapValue(value)
}
