package com.github.mshibuya.cloudformal.generator

import argonaut.Argonaut._
import argonaut._

import scala.collection.immutable.ListMap

class ParseError(message: String) extends Exception(message)

case class Specification(propertyTypes: ListMap[String, PropertySpecification],
                         resourceSpecificationVersion: String,
                         resourceTypes: ListMap[String, ResourceSpecification]) {
  val eligiblePropertyTypes = propertyTypes - "Tag"
  val eligibleResourceTypes = resourceTypes
}

object Specification {
  implicit def decoder: DecodeJson[Specification] =
    jdecode3L(Specification.apply)("PropertyTypes", "ResourceSpecificationVersion", "ResourceTypes")

  def decode(json: String): Specification = Parse.decodeEither[Specification](json) match {
    case Right(spec) => spec
    case Left(msg)  => throw new ParseError(msg)
  }
}
