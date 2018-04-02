package com.github.mshibuya.cloudformal

import java.io.PrintWriter

import com.github.mshibuya.cloudformal.model.Stack

class Writer(formatter: Formatter = JsonFormatter()) {
  def write(stack: Stack): String = formatter.format(stack.render)
}

class FileWriter(formatter: Formatter = JsonFormatter(),
                 path: String = "target") extends Writer(formatter) {
  def writeFile(stack: Stack): Unit = {
    val file = new PrintWriter(s"$path/${stack.filename}.${formatter.extension}")
    try {
      file.write(write(stack))
    } finally {
      file.close()
    }
  }
}