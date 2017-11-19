package com.github.mshibuya.cloudformal.generator

import java.util.Locale.ENGLISH

object Inflector {
  def camelize(str: String): String = str.substring(0, 1).toLowerCase(ENGLISH) + str.substring(1)
}
