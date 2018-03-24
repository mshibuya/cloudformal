package com.github.mshibuya.cloudformal.model

import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

import argonaut.Argonaut._
import argonaut._

import scala.collection.immutable.ListMap

sealed abstract class Property[+A]

sealed abstract class NonEmptyProperty[+A] extends Property[A]

abstract class Expression[+A] extends NonEmptyProperty[A] with Renderable

trait Value[+A] extends NonEmptyProperty[A] with Formattable

case class BooleanValue(value: Boolean) extends Value[Boolean] {
  def toJson: Json = value.asJson
}
case class IntValue(value: Int) extends Value[Int] {
  def toJson: Json = value.asJson
}
case class LongValue(value: Long) extends Value[Long] {
  def toJson: Json = value.asJson
}
case class DoubleValue(value: Double) extends Value[Double] {
  def toJson: Json = value.asJson
}
case class StringValue(value: String) extends Value[String] {
  def toJson: Json = value.asJson
}
case class JsonValue(value: Json) extends Value[Json] {
  def toJson: Json = value.asJson
}
case class TimestampValue(value: ZonedDateTime) extends Value[ZonedDateTime] {
  def toJson: Json = value.format(DateTimeFormatter.ISO_ZONED_DATE_TIME).asJson
}
case class SeqValue[A](value: Seq[Property[A]]) extends Value[Seq[A]] {
  def toJson: Json = value.collect {
    case v: Value[_] => v.toJson
    case r: Renderable => r.render().toJson
  }.toList.asJson
}
case class MapValue[A](value: ListMap[String, Property[A]]) extends Value[ListMap[String, A]] {
  implicit def ListMapEncodeJson[K, V](implicit K: EncodeJsonKey[K], e: EncodeJson[V]): EncodeJson[ListMap[K, V]] = {
    EncodeJson(x => jObjectAssocList(
      x.toList.map{
        case (k, v) => (K.toJsonKey(k), e(v))
      }
    ))
  }

  def toJson: Json = value.collect {
    case (k, v: Value[_]) => k -> v.toJson
    case (k, r: Renderable) => k -> r.render().toJson
  }.asJson

  def ++(another: MapValue[_]): MapValue[_] = Value(value.toSeq ++ another.value.toSeq: _*)
}

object Value {
  def apply(value: Boolean): BooleanValue = BooleanValue(value)
  def apply(value: Int): IntValue = IntValue(value)
  def apply(value: Long): LongValue = LongValue(value)
  def apply(value: Double): DoubleValue = DoubleValue(value)
  def apply(value: String): StringValue = StringValue(value)
  def apply(value: Json): JsonValue = JsonValue(value)
  def apply(value: ZonedDateTime): TimestampValue = TimestampValue(value)
  def apply[A](value: Seq[Property[A]]): SeqValue[A] = SeqValue(value)
  def apply[A](value: Map[String, Property[A]]): MapValue[A] = MapValue(ListMap(value.toSeq: _*))
  def apply[A](value: ListMap[String, Property[A]]): MapValue[A] = MapValue(value)
  def apply[A](value: Tuple2[String, Property[A]]*): MapValue[A] = MapValue(ListMap(value: _*))
}

case object Empty extends Property[Nothing]