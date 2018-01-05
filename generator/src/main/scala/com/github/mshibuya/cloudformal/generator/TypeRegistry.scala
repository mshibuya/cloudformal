package com.github.mshibuya.cloudformal.generator

object TypeRegistry {
  def lookup(name: String, typeName: String): String = name match {
    case _ => typeName match {
      case "Integer" => "Int"
      case "Timestamp" => "java.time.ZonedDateTime"
      case _ => typeName
    }
  }
}
