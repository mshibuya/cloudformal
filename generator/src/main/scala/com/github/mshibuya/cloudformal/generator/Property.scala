package com.github.mshibuya.cloudformal.generator

import argonaut.Argonaut._
import argonaut._

case class Property(name: String,
                    itemType: Option[String],
                    primitiveType: Option[String],
                    primitiveItemType: Option[String],
                    propertyType: Option[String],
                    required: Boolean) {
  val identifier: String =
    if (name == "Type")
      "`type`"
    else
      Inflector.camelize(name)

  val isList: Boolean = propertyType.exists(_.equals("List"))
  val isMap: Boolean = propertyType.exists(_.equals("Map"))
  val isJson: Boolean = primitiveType.exists(_.equals("Json")) || primitiveItemType.exists(_.equals("Json"))

  val inferredTypeName: String =
    if (isList) {
      s"Seq[${TypeRegistry.lookup(name, primitiveItemType.orElse(itemType).get)}]"
    } else if(isMap) {
      s"ListMap[String, ${TypeRegistry.lookup(name, primitiveItemType.orElse(itemType).get)}]"
    } else {
      TypeRegistry.lookup(name, primitiveType.orElse(propertyType).get)
    }

  val typeName: String = {
    if(required)
      inferredTypeName
    else
      s"Option[${inferredTypeName}] = None"
  }

  def methodValue: String = {
    s"  def ${identifier}: ${typeName}"
  }

  def argumentValue: String = {
    s"    ${identifier}: ${typeName}"
  }

  def renderedValue: String = {
    val value = if(required) s"Some(Formattable(${identifier}))" else s"${identifier}.map(Formattable(_))"
    s"""    "${name}" -> ${value}"""
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
