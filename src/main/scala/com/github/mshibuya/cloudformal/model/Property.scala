package com.github.mshibuya.cloudformal.model

import java.time.ZonedDateTime

import argonaut.Json

import scala.collection.immutable.ListMap

sealed abstract class Property[+A]

sealed abstract class NonEmptyProperty[+A] extends Property[A] with Renderable

case class ListProperty[+A](values: NonEmptyProperty[A]*) extends NonEmptyProperty[Seq[A]] {
  def render: Formattable = Formattable(values)
}

case class MapProperty[+A](values: Tuple2[String, NonEmptyProperty[_]]*) extends NonEmptyProperty[ListMap[String, A]] {
  def render: Formattable = Formattable(values)
}

abstract class Expression[+A] extends NonEmptyProperty[A]

final case class Value[+A](value: A) extends NonEmptyProperty[A] {
  def render: Formattable = value match {
    case b:Boolean => Formattable(b)
    case i:Int => Formattable(i)
    case l:Long => Formattable(l)
    case d:Double => Formattable(d)
    case s:String => Formattable(s)
    case j:Json => Formattable(j)
    case t:ZonedDateTime => Formattable(t)
    case r:Renderable => Formattable(r)
    case s:Seq[_] => Formattable(s)
    case l:ListMap[String, _] => Formattable(l)
  }
}

case object Empty extends Property[Nothing]