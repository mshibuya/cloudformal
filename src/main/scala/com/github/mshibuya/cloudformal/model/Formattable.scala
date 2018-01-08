package com.github.mshibuya.cloudformal.model

import java.time.ZonedDateTime

import argonaut.Json

import scala.collection.immutable.ListMap

sealed trait Formattable

case class FormattableBoolean(value: Boolean) extends Formattable
case class FormattableInt(value: Int) extends Formattable
case class FormattableLong(value: Long) extends Formattable
case class FormattableDouble(value: Double) extends Formattable
case class FormattableString(value: String) extends Formattable
case class FormattableJson(value: Json) extends Formattable
case class FormattableTimestamp(value: ZonedDateTime) extends Formattable
case class FormattableSeq(value: Seq[Formattable]) extends Formattable
case class FormattableMap(value: ListMap[String, Formattable]) extends Formattable

object Formattable {
  def apply(value: Boolean): Formattable = FormattableBoolean(value)
  def apply(value: Int): Formattable = FormattableInt(value)
  def apply(value: Long): Formattable = FormattableLong(value)
  def apply(value: Double): Formattable = FormattableDouble(value)
  def apply(value: String): Formattable = FormattableString(value)
  def apply(value: Json): Formattable = FormattableJson(value)
  def apply(value: ZonedDateTime): Formattable = FormattableTimestamp(value)
  def apply(value: Renderable): Formattable = value.render

  def apply[A](value: Seq[A]): Formattable = FormattableSeq(
    value.collect {
      case b:Boolean => apply(b)
      case i:Int => apply(i)
      case l:Long => apply(l)
      case d:Double => apply(d)
      case s:String => apply(s)
      case j:Json => apply(j)
      case t:ZonedDateTime => apply(t)
      case r:Renderable => apply(r)
    }
  )

  def apply[A](value: Map[String, A]): Formattable = apply(ListMap(value.toSeq: _*))

  def apply[A](value: ListMap[String, A]): Formattable = FormattableMap(
    value.collect {
      case (key, b:Boolean) => key -> apply(b)
      case (key, i:Int) => key -> apply(i)
      case (key, l:Long) => key -> apply(l)
      case (key, d:Double) => key -> apply(d)
      case (key, s:String) => key -> apply(s)
      case (key, j:Json) => key -> apply(j)
      case (key, t:ZonedDateTime) => key -> apply(t)
      case (key, r:Renderable) => key -> apply(r)
      case (key, s:Seq[A]) => key -> apply(s)
      case (key, l:Map[String, _]) => key -> apply(l)
      case (key, l:ListMap[String, _]) => key -> apply(l)
    }
  )

  def apply(values: Tuple2[String, Formattable]*): FormattableMap =
    FormattableMap(ListMap(values: _*)
      .collect {
        case (k, v) => k -> v
      })

  def withProperties(values: Tuple2[String, Property[_]]*): FormattableMap =
    FormattableMap(ListMap(values: _*)
      .collect {
        case (k, e: Expression[_]) => k -> e.render
        case (k, v: Value[_]) => k -> v.render
      })

  val emptyMap: FormattableMap = FormattableMap(ListMap.empty)
}