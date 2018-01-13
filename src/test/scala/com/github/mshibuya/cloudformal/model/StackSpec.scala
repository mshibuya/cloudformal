package com.github.mshibuya.cloudformal.model

import org.scalatest._

class StackSpec extends FunSpec with MustMatchers {
  object TestStack extends Stack {
    val name = "Test"
    def description: String = "description"
    def parameters = Nil
    def mappings = Nil
    def resources = Nil
    def outputs = Nil
  }
  it("works") {
    TestStack.render().value("Resources") mustBe Formattable.emptyMap
  }
}
