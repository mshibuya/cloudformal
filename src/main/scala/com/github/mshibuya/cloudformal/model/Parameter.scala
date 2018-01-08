package com.github.mshibuya.cloudformal.model

trait Parameter[ItemType, ResultType] extends Renderable with Referenceable[ResultType] {
  def logicalId: String
  def dataType: String
  def constraintDescription: Property[String]
  def default: Property[ResultType]
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
    noEcho: Property[Boolean] = Empty) extends Parameter[String, String] {
  def dataType: String = "String"

  def render(): Formattable = Formattable.withProperties(
    "Type" -> Value(dataType),
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

case class CommaDelimitedListParameter(
    logicalId: String,
    allowedPattern: Property[String] = Empty,
    allowedValues: Property[Seq[String]] = Empty,
    constraintDescription: Property[String] = Empty,
    default: Property[Seq[String]] = Empty,
    description: Property[String] = Empty,
    maxLength: Property[Int] = Empty,
    minLength: Property[Int] = Empty,
    noEcho: Property[Boolean] = Empty) extends Parameter[String, Seq[String]] {
  def dataType: String = "CommaDelimitedList"
  def defaultAsCommaSeparated: Property[String] = default match {
    case Value(v) => Value(v.mkString(","))
    case e: Expression[Seq[String]] => Fn.Join(",", e)
    case _ => Empty
  }

  def render(): Formattable = Formattable.withProperties(
    "Type" -> Value(dataType),
    "AllowedPattern" -> allowedPattern,
    "AllowedValues" -> allowedValues,
    "ConstraintDescription" -> constraintDescription,
    "Default" -> defaultAsCommaSeparated,
    "Description" -> description,
    "MaxLength" -> maxLength,
    "MinLength" -> minLength,
    "NoEcho" -> noEcho
  )
}

trait AbstractNumberParameter[ItemType, ResultType] extends Parameter[ItemType, ResultType] {
  def allowedValues: Property[Seq[ItemType]]
  def constraintDescription: Property[String]
  def default: Property[ResultType]
  def description: Property[String]
  def maxValue: Property[ItemType]
  def minValue: Property[ItemType]
  def noEcho: Property[Boolean]

  def render(): Formattable = Formattable.withProperties(
    "Type" -> Value(dataType),
    "AllowedValues" -> allowedValues,
    "ConstraintDescription" -> constraintDescription,
    "Default" -> default,
    "Description" -> description,
    "MaxValue" -> maxValue,
    "MinValue" -> minValue,
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
    noEcho: Property[Boolean] = Empty) extends AbstractNumberParameter[A, A] {
  def dataType: String = "Number"
}

case class NumberListParameter[A: Numeric](
    logicalId: String,
    allowedValues: Property[Seq[A]] = Empty,
    constraintDescription: Property[String] = Empty,
    default: Property[Seq[A]] = Empty,
    description: Property[String] = Empty,
    maxValue: Property[A] = Empty,
    minValue: Property[A] = Empty,
    noEcho: Property[Boolean] = Empty) extends AbstractNumberParameter[A, Seq[A]] {
  def dataType: String = "List<Number>"
}

trait AbstractTypedParameter[A] extends Parameter[A, A] {
  def allowedPattern: Property[String]
  def allowedValues: Property[Seq[String]]
  def constraintDescription: Property[String]
  def default: Property[A]
  def description: Property[String]
  def noEcho: Property[Boolean]

  def render(): Formattable = Formattable.withProperties(
    "Type" -> Value(dataType),
    "AllowedPattern" -> allowedPattern,
    "AllowedValues" -> allowedValues,
    "ConstraintDescription" -> constraintDescription,
    "Default" -> default,
    "Description" -> description,
    "NoEcho" -> noEcho
  )
}

case class TypedParameter(
    logicalId: String,
    dataType: String,
    allowedPattern: Property[String] = Empty,
    allowedValues: Property[Seq[String]] = Empty,
    constraintDescription: Property[String] = Empty,
    default: Property[String] = Empty,
    description: Property[String] = Empty,
    noEcho: Property[Boolean] = Empty) extends AbstractTypedParameter[String]

case class TypedListParameter(
    logicalId: String,
    dataType: String,
    allowedPattern: Property[String] = Empty,
    allowedValues: Property[Seq[String]] = Empty,
    constraintDescription: Property[String] = Empty,
    default: Property[Seq[String]] = Empty,
    description: Property[String] = Empty,
    noEcho: Property[Boolean] = Empty) extends AbstractTypedParameter[Seq[String]]
