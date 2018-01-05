package com.github.mshibuya.cloudformal.generator

import argonaut._
import Argonaut._

case class PropertySpecification(documentation: String, properties: Seq[Property])

object PropertySpecification {
  implicit def decoder: DecodeJson[PropertySpecification] =
    jdecode2L(PropertySpecification.apply)("Documentation", "Properties")
}