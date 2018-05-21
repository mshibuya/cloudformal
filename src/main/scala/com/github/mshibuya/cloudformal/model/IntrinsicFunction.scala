package com.github.mshibuya.cloudformal.model

trait IntrinsicFunction[+A] extends Expression[A]

case class Ref[+A](logicalName: String) extends IntrinsicFunction[A] {
  def render(): Formattable = Value(
    "Ref" -> Value(logicalName)
  )
  def as[T]: Ref[T] = Ref[T](logicalName)
}

object Fn {
  case class Base64(valueToEncode: Property[String]) extends IntrinsicFunction[String] {
    def render: Formattable = Value(
      "Fn::Base64" -> valueToEncode
    )
  }

  case class FindInMap[+A](mapping: Mapping, topLevelKey: NonEmptyProperty[String], secondLevelKey: NonEmptyProperty[String]) extends IntrinsicFunction[A] {
    def render: Formattable = Value(
      "Fn::FindInMap" -> Value(Seq(Value(mapping.logicalId), topLevelKey, secondLevelKey))
    )
  }

  case class GetAtt[+A](logicalId: String, attributeName: String) extends IntrinsicFunction[A] {
    def render: Formattable = Value(
      "Fn::GetAtt" -> Value(Seq(Value(logicalId), Value(attributeName)))
    )
  }

  case class ImportValue[A](sharedValueToImport: NonEmptyProperty[String]) extends IntrinsicFunction[A] {
    def render: Formattable = Value(
      "Fn::ImportValue" -> sharedValueToImport
    )
  }

  case class Join(delimiter: String, listOfValues: NonEmptyProperty[Seq[_]]) extends IntrinsicFunction[String] {
    def render: Formattable = Value(
      "Fn::Join" -> Value(Seq(Value(delimiter), listOfValues))
    )
  }

  case class Select[+A](index: Int, listOfObjects: NonEmptyProperty[Seq[A]]) extends IntrinsicFunction[A] {
    def render: Formattable = Value(
      "Fn::Select" -> Value(Seq(Value(index), listOfObjects))
    )
  }

  case class Split(delimiter: String, sourceString: NonEmptyProperty[String]) extends IntrinsicFunction[String] {
    def render: Formattable = Value(
      "Fn::Split" -> Value(Seq(Value(delimiter), sourceString))
    )
  }
}
