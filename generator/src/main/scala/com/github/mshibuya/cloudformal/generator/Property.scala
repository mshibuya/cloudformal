package com.github.mshibuya.cloudformal.generator

import argonaut.Argonaut._
import argonaut._

case class Property(name: String,
                    itemType: Option[String],
                    primitiveType: Option[String],
                    primitiveItemType: Option[String],
                    `type`: Option[String],
                    required: Boolean) extends HasType {
  val identifier: String =
    if (name == "Type")
      "`type`"
    else
      Inflector.camelize(name)

  val typeName: String = {
    if(required)
      s"NonEmptyProperty[${inferredTypeName}]"
    else
      s"Property[${inferredTypeName}] = Empty"
  }

  def methodValue: String = {
    s"  def ${identifier}: ${typeName}"
  }

  def argumentValue: String = {
    s"    ${identifier}: ${typeName}"
  }

  def renderedValue: String = {
    s"""    "${name}" -> ${identifier}"""
  }
}

object Property {
  implicit def seqDecoder: DecodeJson[Seq[Property]] = {
    DecodeJson(a =>
      a.fields match {
        case None => DecodeResult.fail("Seq[Property]", a.history)
        case Some(s) => {
          def spin(x: List[JsonField], m: DecodeResult[Seq[Property]]): DecodeResult[Seq[Property]] = {
            x match {
              case Nil => m
              case h::t => {
                spin(t, for {
                  mm <- m
                  c = a.downField(h)
                  required <- c.downField("Required").as[Boolean]
                } yield mm ++ Seq(Property(
                  h,
                  c.downField("ItemType").as[String].toOption,
                  c.downField("PrimitiveType").as[String].toOption,
                  c.downField("PrimitiveItemType").as[String].toOption,
                  c.downField("Type").as[String].toOption,
                  required
                )))
              }
            }
          }
          spin(s, DecodeResult.ok(Nil))
        }
      }
    )
  }
}
