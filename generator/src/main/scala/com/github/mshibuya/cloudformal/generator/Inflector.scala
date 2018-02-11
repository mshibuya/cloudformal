package com.github.mshibuya.cloudformal.generator

import java.util.Locale.ENGLISH

object Inflector {
  def camelize(str: String): String = {
    val upperCaseLength = "^[A-Z]{2,}".r.findFirstIn(str).fold(1)(_.length - 1)
    str.substring(0, upperCaseLength).toLowerCase(ENGLISH) + str.substring(upperCaseLength)
  }
}
