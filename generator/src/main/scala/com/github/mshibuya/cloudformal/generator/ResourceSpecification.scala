package com.github.mshibuya.cloudformal.generator

import argonaut.Argonaut._
import argonaut._

case class ResourceSpecification(attributes: Seq[Attribute], documentation: String, properties: Seq[Property])

object ResourceSpecification {
  implicit def decoder = DecodeJson[ResourceSpecification] { c: HCursor =>
    for {
      documentation <- c.downField("Documentation").as[String]
      properties <- c.downField("Properties").as[Seq[Property]](Property.seqDecoder)
    } yield ResourceSpecification(
      c.downField("Attributes").as[Seq[Attribute]](Attribute.seqDecoder).toOption.getOrElse(Nil),
      documentation,
      properties
    )
  }
}