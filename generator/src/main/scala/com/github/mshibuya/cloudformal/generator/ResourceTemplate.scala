package com.github.mshibuya.cloudformal.generator

case class ResourceTemplate(name: String, specification: ResourceSpecification) {
  def nameParts: Seq[String] = name.split("::")
  def packageName = s"com.github.mshibuya.cloudformal.${nameParts.slice(0, 2).map(_.toLowerCase).mkString(".")}"
  def traitName = nameParts(2)
  def fileName = s"${nameParts(2)}.scala"
  def nameConflictsWithResource: Boolean = nameParts(1).equals("ApiGateway")
  def propertySection: String =
    if (specification.properties.isEmpty) {
      s"""  def resourceProperties: FormattableMap = Formattable.emptyMap"""
    } else {
      s"""  def resourceProperties: FormattableMap = Formattable.withProperties(
         |${specification.properties.map(_.renderedValue).mkString(",\n")}
         |  )""".stripMargin
    }

  def render: String = {
    s"""package ${packageName}
      |${if (specification.attributes.exists(_.isJson) || specification.properties.exists(_.isJson)) "\nimport argonaut.Json" else ""}${if (nameConflictsWithResource) "\nimport com.github.mshibuya.cloudformal.model" else ""}
      |import com.github.mshibuya.cloudformal.model._
      |${if (specification.properties.exists(_.isMap)) "\nimport scala.collection.immutable.ListMap\n" else ""}
      |/**
      | * ${specification.documentation}
      | */
      |
      |trait ${traitName} extends ${if (nameConflictsWithResource) "model.Resource" else "Resource"} {
      |  val resourceTypeName = "${name}"
      |
      |${Seq(specification.attributes.map(_.methodValue).mkString("\n"), specification.properties.map(_.methodValue).mkString("\n")).filterNot(_.isEmpty).mkString("\n\n")}
      |
      |${propertySection}
      |}
      |""".stripMargin

  }
}
