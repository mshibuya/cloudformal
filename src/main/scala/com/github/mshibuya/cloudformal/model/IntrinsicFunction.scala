package com.github.mshibuya.cloudformal.model

trait IntrinsicFunction[+A] extends Expression[A]

case class Ref[+A](logicalName: String) extends IntrinsicFunction[A] {
  def render: Formattable = Formattable(
    "Ref" -> Formattable(logicalName)
  )
  def as[T]: Ref[T] = Ref[T](logicalName)
}

object Fn {
  case class Base64(valueToEncode: Property[String]) extends IntrinsicFunction[String] {
    def render: Formattable = Formattable.withProperties(
      "Fn::Base64" -> valueToEncode
    )
  }

  case class GetAtt[+A](logicalId: String, attributeName: String) extends IntrinsicFunction[A] {
    def render: Formattable = Formattable(
      "Fn::GetAtt" -> Formattable(Seq(logicalId, attributeName))
    )
  }

  case class FindInMap[+A](mapping: Mapping, topLevelKey: NonEmptyProperty[String], secondLevelKey: NonEmptyProperty[String]) extends IntrinsicFunction[A] {
    def render: Formattable = Formattable(
      "Fn::FindInMap" -> Formattable(Seq(mapping.logicalId, topLevelKey, secondLevelKey))
    )
  }

  case class Join(delimiter: String, listOfValues: NonEmptyProperty[Seq[_]]) extends IntrinsicFunction[String] {
    def render: Formattable = Formattable(
      "Fn::Join" -> Formattable(Seq(delimiter, listOfValues))
    )
  }

  case class Select[+A](index: Int, listOfObjects: NonEmptyProperty[Seq[A]]) extends IntrinsicFunction[A] {
    def render: Formattable = Formattable(
      "Fn::Select" -> Formattable(Seq(index, listOfObjects))
    )
  }

  case class Split(delimiter: String, sourceString: NonEmptyProperty[String]) extends IntrinsicFunction[String] {
    def render: Formattable = Formattable(
      "Fn::Split" -> Formattable(Seq(delimiter, sourceString))
    )
  }
}
