package com.github.mshibuya.cloudformal.model

trait Output[A] extends Expression[Output[A]] {
  val logicalId: String
  val value: NonEmptyProperty[A]
  val description: Property[String]
}

case class NormalOutput[A](
    logicalId: String,
    value: NonEmptyProperty[A],
    description: Property[String] = Empty) extends Output[A] {

  def render(): Formattable = Value(
    "Description" -> description,
    "Value" -> value
  )
}

case class ExportedOutput[A](
    logicalId: String,
    exportName: String,
    value: NonEmptyProperty[A],
    description: Property[String] = Empty) extends Output[A] {
  def render(): Formattable = Value(
    "Description" -> description,
    "Value" -> value,
    "Export" -> Value("Name" -> Value(exportName))
  )

  def importValue: Fn.ImportValue[A] = Fn.ImportValue(Value(exportName))
}

object Output {
  def apply[A](logicalId: String,
               value: NonEmptyProperty[A],
               description: Property[String] = Empty): Output[A] = NormalOutput(logicalId, value, description)
}