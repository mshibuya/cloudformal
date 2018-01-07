package com.github.mshibuya.cloudformal.model

trait IntrinsicFunction[+A] extends Expression[A]

case class Ref[+A](logicalName: String) extends IntrinsicFunction[A] {
  def render: Formattable = Formattable(
    "Ref" -> Formattable(logicalName)
  )
}

object Fn {
  case class GetAtt[+A](logicalId: String, attributeName: String) extends IntrinsicFunction[A] {
    def render: Formattable = Formattable(
      "Fn::GetAtt" -> Formattable(Seq(logicalId, attributeName))
    )
  }
}
