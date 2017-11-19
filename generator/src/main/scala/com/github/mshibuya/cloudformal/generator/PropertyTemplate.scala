package com.github.mshibuya.cloudformal.generator

import net.ruippeixotog.scalascraper.model.{Element, ElementNode, Node, TextNode}

class ParseError extends RuntimeException

case class PropertyTemplate(name: String, typeDescription: String, required: Boolean) {
  def propertyType: String = {
    val t = TypeRegistry.lookup(name, typeDescription)
    if(required)
      t
    else
      s"Option[${t}] = None"
  }

  def methodValue: String = {
    s"  def ${Inflector.camelize(name)}: ${propertyType}"
  }

  def renderedValue: String = {
    val value = if(required) s"Some(Formattable(${Inflector.camelize(name)}))" else s"${Inflector.camelize(name)}.map(Formattable(_))"
    s"""    "${name}" -> ${value}"""
  }
}

object PropertyTemplate {
  def apply(definitionTitle: Element, definitionDescription: Element): Option[PropertyTemplate] = {
    for {
      name <- definitionTitle.select("code").headOption
      attributes = definitionDescription.select("em")
      required <- attributes.find(_.text.contains("Required")).flatMap(_.parent.map(p => extractContent(p.childNodes)))
      typeDescription <- attributes.find(_.text.contains("Type")).flatMap(_.parent.map(p => extractContent(p.childNodes)))
    } yield {
      PropertyTemplate(name.text, stripSpaces(typeDescription), required.toLowerCase.contains("yes"))
    }
  }

  private[this] def stripSpaces(str: String): String = {
    str.replaceAll(" +", " ").replaceAll("(^ |: +| $)", "")
  }

  private[this] def extractContent(nodes: Iterable[Node]): String = {
    nodes.toSeq.drop(1).collect {
      case n: TextNode => n.content
      case e: ElementNode[_] => e.element.text
    }.mkString("")
  }
}
