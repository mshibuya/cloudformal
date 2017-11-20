package com.github.mshibuya.cloudformal.generator

/**
  *
  * @param name
  * @param entries
  */
case class PropertyTemplate(uri: String, name: String, entries: Seq[EntryTemplate]) {
  def nameParts: Seq[String] = name.split("\\.")
  def packageName = s"com.github.mshibuya.cloudformal.${nameParts.init.mkString(".")}"
  def className = nameParts.last
  def fileName = s"${nameParts.last}.scala"
  def render: String = {
    s"""package ${packageName}
      |
      |import com.github.mshibuya.cloudformal.model._
      |
      |/**
      | * ${uri}
      | */
      |
      |case class ${className}(
      |${entries.map(_.argumentValue).mkString(",\n")}) extends Renderable {
      |  def render: Formattable = Formattable.opt(
      |${entries.map(_.renderedValue).mkString(",\n")}
      |  )
      |}
      |""".stripMargin

  }
}
