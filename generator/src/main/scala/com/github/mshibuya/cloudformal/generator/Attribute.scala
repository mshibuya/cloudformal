package com.github.mshibuya.cloudformal.generator

import argonaut.Argonaut._
import argonaut._

case class Attribute(name: String,
                     itemType: Option[String],
                     primitiveType: Option[String],
                     primitiveItemType: Option[String],
                     `type`: Option[String]) extends HasType {
  val identifier: String = s"${Inflector.camelize(name.replace(".", ""))}Attribute"

  def methodValue: String = {
    s"""  def ${identifier}: Expression[${inferredTypeName}] = Fn.GetAtt(logicalId, "${name}")"""
  }
}

object Attribute {
  implicit def seqDecoder: DecodeJson[Seq[Attribute]] = {
    DecodeJson(a =>
      a.fields match {
        case None => DecodeResult.fail("Seq[Attribute]", a.history)
        case Some(s) => {
          def spin(x: List[JsonField], m: DecodeResult[Seq[Attribute]]): DecodeResult[Seq[Attribute]] = {
            x match {
              case Nil => m
              case h::t => {
                spin(t, for {
                  mm <- m
                  c = a.downField(h)
                } yield mm ++ Seq(Attribute(
                  h,
                  c.downField("ItemType").as[String].toOption,
                  c.downField("PrimitiveType").as[String].toOption,
                  c.downField("PrimitiveItemType").as[String].toOption,
                  c.downField("Type").as[String].toOption
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

