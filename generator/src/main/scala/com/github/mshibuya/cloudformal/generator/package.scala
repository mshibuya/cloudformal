package com.github.mshibuya.cloudformal

import argonaut.{DecodeJson, DecodeResult}
import argonaut.Json.JsonField

import scala.collection.immutable.ListMap

package object generator {
  implicit def ListMapDecodeJson[V](implicit e: DecodeJson[V]): DecodeJson[ListMap[String, V]] = {
    DecodeJson(a =>
      a.fields match {
        case None => DecodeResult.fail("[V]ListMap[String, V]", a.history)
        case Some(s) => {
          def spin(x: List[JsonField], m: DecodeResult[ListMap[String, V]]): DecodeResult[ListMap[String, V]] = {
            x match {
              case Nil => m
              case h::t => {
                spin(t, for {
                  mm <- m
                  v <- a.get(h)(e)
                } yield mm + ((h, v)))
              }
            }
          }
          spin(s, DecodeResult.ok(ListMap.empty[String, V]))
        }
      }
    )
  }
}
