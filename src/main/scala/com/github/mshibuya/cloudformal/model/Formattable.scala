package com.github.mshibuya.cloudformal.model

import argonaut.Argonaut._
import argonaut._

import scala.collection.immutable.ListMap

trait Formattable {
  def toJson: Json
}

case class FormattableMap(value: ListMap[String, Formattable]) extends Formattable {
  implicit def ListMapEncodeJson[K, V](implicit K: EncodeJsonKey[K], e: EncodeJson[V]): EncodeJson[ListMap[K, V]] = {
    EncodeJson(x => jObjectAssocList(
      x.toList.map{
        case (k, v) => (K.toJsonKey(k), e(v))
      }
    ))
  }

  def toJson: Json = value.collect {
    case (k, v) => k -> v.toJson
  }.asJson
}

object FormattableMap {
  def apply(value: Tuple2[String, Formattable]*): FormattableMap = FormattableMap(ListMap(value: _*))
}