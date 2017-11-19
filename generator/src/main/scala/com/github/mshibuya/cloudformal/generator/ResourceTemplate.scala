package com.github.mshibuya.cloudformal.generator

case class ResourceTemplate(name: String, properties: Seq[PropertyTemplate]) {
  def nameParts: Seq[String] = name.split("::")
  def packageName = s"com.github.mshibuya.cloudformal.${nameParts.slice(0, 2).map(_.toLowerCase).mkString(".")}"
  def traitName = nameParts(2)
  def fileName = s"${nameParts(2)}.scala"
  def render: String = {
    s"""package ${packageName}
      |
      |import com.github.mshibuya.cloudformal.model._
      |
      |trait ${traitName} extends Resource {
      |  val resourceType = "${name}"
      |
      |${properties.map(_.methodValue).mkString("\n")}
      |
      |  def properties: FormattableMap = Formattable.opt(
      |${properties.map(_.renderedValue).mkString(",\n")}
      |  )
      |}
      |""".stripMargin

  }
}
