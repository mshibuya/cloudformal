package com.github.mshibuya.cloudformal.command

import com.github.mshibuya.cloudformal.model._
import org.scalatest._

object Test extends Stack {
  val name = "test"
  def description: String = "description"
  def parameters = Nil
  def mappings = Nil
  def resources = Nil
  def outputs = Nil
}

object MyTestStack extends Stack {
  val name = "my-test"
  def description: String = "description"
  def parameters = Nil
  def mappings = Nil
  def resources = Nil
  def outputs = Nil
}

class StackWithParameter(val stage: String) extends Stack {
  val name = "stack-with-parameter"
  def description: String = "description"
  def parameters = Nil
  def mappings = Nil
  def resources = Nil
  def outputs = Nil
}
object ProductionStack extends StackWithParameter(stage = "production")

class StackLoaderSpec extends FunSpec with MustMatchers {
  object InnerStack extends Stack {
    val name = "Inner"
    def description: String = "description"
    def parameters = Nil
    def mappings = Nil
    def resources = Nil
    def outputs = Nil
  }

  it("loads a stack by stack name") {
    StackLoader().findStacksBy("my-test") mustBe Seq(MyTestStack)
  }

  it("loads a stack by stack class name") {
    StackLoader().findStacksBy("*MyTestStack") mustBe Seq(MyTestStack)
  }

  it("does not support loading of inner objects") {
    StackLoader().findStacksBy("*InnerStack") mustBe Nil
  }

  it("supports wildcard") {
    StackLoader().findStacksBy("*Stack").toSet mustBe Set(MyTestStack, ProductionStack)
    StackLoader().findStacksBy("*My*") mustBe Seq(MyTestStack)
  }

  it("performs whole match on stack name") {
    StackLoader().findStacksBy("test") mustBe Seq(Test)
  }

  it("performs whole match on stack class name") {
    StackLoader().findStacksBy("*Test") mustBe Seq(Test)
  }

  it("ignores classes inheriting from a stack") {
    StackLoader().findStacksBy("*StackWithParameter") mustBe Nil
  }

  it("loads a stack inheriting indirectly") {
    StackLoader().findStacksBy("*ProductionStack") mustBe Seq(ProductionStack)
  }
}