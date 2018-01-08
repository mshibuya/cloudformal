package com.github.mshibuya.cloudformal.model

trait Parameter[A] extends Renderable with Referenceable {
  def logicalId: String
  def dataType: NonEmptyProperty[String]
  def constraintDescription: Property[String]
  def default: Property[A]
  def description: Property[String]
  def noEcho: Property[Boolean]
}

case class StringParameter(
    logicalId: String,
    allowedPattern: Property[String] = Empty,
    allowedValues: Property[Seq[String]] = Empty,
    constraintDescription: Property[String] = Empty,
    default: Property[String] = Empty,
    description: Property[String] = Empty,
    maxLength: Property[Int] = Empty,
    minLength: Property[Int] = Empty,
    noEcho: Property[Boolean] = Empty) extends Parameter[String] {
  def dataType: NonEmptyProperty[String] = Value("String")

  def render(): Formattable = Formattable.withProperties(
    "Type" -> dataType,
    "AllowedPattern" -> allowedPattern,
    "AllowedValues" -> allowedValues,
    "ConstraintDescription" -> constraintDescription,
    "Default" -> default,
    "Description" -> description,
    "MaxLength" -> maxLength,
    "MinLength" -> minLength,
    "NoEcho" -> noEcho
  )
}

case class NumberParameter[A: Numeric](
    logicalId: String,
    allowedValues: Property[Seq[A]] = Empty,
    constraintDescription: Property[String] = Empty,
    default: Property[A] = Empty,
    description: Property[String] = Empty,
    maxValue: Property[A] = Empty,
    minValue: Property[A] = Empty,
    noEcho: Property[Boolean] = Empty) extends Parameter[A] {
  def dataType: NonEmptyProperty[String] = Value("Number")

  def render(): Formattable = Formattable.withProperties(
    "Type" -> dataType,
    "AllowedValues" -> allowedValues,
    "ConstraintDescription" -> constraintDescription,
    "Default" -> default,
    "Description" -> description,
    "MaxValue" -> maxValue,
    "MinValue" -> minValue,
    "NoEcho" -> noEcho
  )
}
