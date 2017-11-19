package com.github.mshibuya.cloudformal

import argonaut.Argonaut._
import argonaut._
import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

trait Formatter {
  def format(formattable: Formattable): String
  def extension: String
}

case class JsonFormatter() extends Formatter with EncodeJsons {
  implicit def ListMapEncodeJson[K, V](implicit K: EncodeJsonKey[K], e: EncodeJson[V]): EncodeJson[ListMap[K, V]] = {
    EncodeJson(x => jObjectAssocList(
      x.toList.map{
        case (k, v) => (K.toJsonKey(k), e(v))
      }
    ))
  }

  implicit def FormattableEncodeJson: EncodeJson[Formattable] = {
    EncodeJson(a => {
      a match {
        case FormattableString(s) => s.value.asJson
        case FormattableBoolean(b) => b.asJson
        case FormattableInt(i) => i.asJson
        case FormattableSeq(s) => s.toList.asJson(ListEncodeJson[Formattable])
        case FormattableMap(m) => m.asJson(ListMapEncodeJson[String, Formattable])
      }
    })
  }

  val extension = "json"
  val prettyParams = PrettyParams.spaces2.copy(preserveOrder = true)

  def format(formattable: Formattable) = formattable.asJson.pretty(prettyParams)
}