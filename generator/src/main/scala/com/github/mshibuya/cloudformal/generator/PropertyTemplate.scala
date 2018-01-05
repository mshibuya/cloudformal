package com.github.mshibuya.cloudformal.generator

case class PropertyTemplate(name: String, specification: PropertySpecification) {
  def nameParts: Seq[String] = name.split("\\.").flatMap(_.split("::"))
  def packageName = s"com.github.mshibuya.cloudformal.${nameParts.slice(0, 2).map(_.toLowerCase).mkString(".")}"
  def className = nameParts.last
  def fileName = s"${nameParts.last}.scala"
  def render: String = {
    s"""package ${packageName}
      |${if (specification.properties.exists(_.isJson)) "\nimport argonaut.Json" else ""}
      |import com.github.mshibuya.cloudformal.model._
      |${if (specification.properties.exists(_.isMap)) "\nimport scala.collection.immutable.ListMap\n" else "" }
      |/**
      | * ${specification.documentation}
      | */
      |
      |case class ${className}(
      |${specification.properties.map(_.argumentValue).mkString(",\n")}) extends Renderable {
      |  def render: Formattable = Formattable.opt(
      |${specification.properties.map(_.renderedValue).mkString(",\n")}
      |  )
      |}
      |""".stripMargin
  }
}
