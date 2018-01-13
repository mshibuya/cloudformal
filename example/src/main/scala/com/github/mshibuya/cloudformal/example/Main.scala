package com.github.mshibuya.cloudformal.example

import com.github.mshibuya.cloudformal.Writer

object Main {
  def main(args: Array[String]): Unit = {
    Writer().write(ApplicationStack)
    Writer().write(WordPressMultiAZStack)
  }
}
