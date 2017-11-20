package com.github.mshibuya.cloudformal.generator

case class ResourceTemplate(uri: String, name: String, entries: Seq[EntryTemplate]) {
  def nameParts: Seq[String] = name.split("::")
  def packageName = s"com.github.mshibuya.cloudformal.${nameParts.slice(0, 2).map(_.toLowerCase).mkString(".")}"
  def traitName = nameParts(2)
  def fileName = s"${nameParts(2)}.scala"
  def render: String = {
    s"""package ${packageName}
      |
      |import com.github.mshibuya.cloudformal.model._
      |
      |/**
      | * ${uri}
      | */
      |
      |trait ${traitName} extends Resource {
      |  val resourceType = "${name}"
      |
      |${entries.map(_.methodValue).mkString("\n")}
      |
      |  def properties: FormattableMap = Formattable.opt(
      |${entries.map(_.renderedValue).mkString(",\n")}
      |  )
      |}
      |""".stripMargin

  }
}
