package com.github.mshibuya.cloudformal.model

import scala.collection.immutable.ListMap

sealed trait Formattable

case class FormattableBoolean(value: Boolean) extends Formattable
case class FormattableInt(value: Int) extends Formattable
case class FormattableString(value: String) extends Formattable
case class FormattableSeq(value: Seq[Formattable]) extends Formattable
case class FormattableMap(value: ListMap[String, Formattable]) extends Formattable

object Formattable {
  def apply(value: Boolean): Formattable = FormattableBoolean(value)
  def apply(value: Int): Formattable = FormattableInt(value)
  def apply(value: String): Formattable = FormattableString(value)
  def apply(value: Renderable): Formattable = value.render

  def apply[A](value: Seq[A]): Formattable = FormattableSeq(
    value.collect {
      case b:Boolean => apply(b)
      case i:Int => apply(i)
      case s:String => apply(s)
      case r:Renderable => apply(r)
    }
  )

  def apply(values: Tuple2[String, Formattable]*): FormattableMap = FormattableMap(ListMap(values: _*).collect { case (k, v) => k -> v })

  def opt(values: Tuple2[String, Option[Formattable]]*): FormattableMap = FormattableMap(ListMap(values: _*).collect { case (k, Some(v)) => k -> v })

  val emptyMap: Formattable = FormattableMap(ListMap.empty)
}