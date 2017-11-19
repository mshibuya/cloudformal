package com.github.mshibuya.cloudformal.generator

object TypeRegistry {
  def lookup(name: String, description: String): String = {
    name match {
      case "SecurityGroups" => "Seq[String]"
      case _ =>
        description match {
          case "Boolean" => description
          case "Integer" => "Int"
          case "String" => description
          case "List of String values" => "Seq[String]"
          case t => {
            println(s"Unknown type: ${t}")
            "String"
          }
        }
    }
  }
}
