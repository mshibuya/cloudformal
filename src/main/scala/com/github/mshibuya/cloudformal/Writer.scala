package com.github.mshibuya.cloudformal

import java.io.PrintWriter

import com.github.mshibuya.cloudformal.model.Stack

case class Writer(formatter: Formatter = JsonFormatter(),
                  path: String = "target") {
  def write(stack: Stack) = {
    val file = new PrintWriter(s"$path/${stack.filename}.${formatter.extension}")
    try {
      file.write(formatter.format(stack.render))
    } finally {
      file.close()
    }
  }
}
