package com.github.mshibuya.cloudformal.generator

import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.model._

class ParseError extends RuntimeException

case class EntryTemplate(name: String, typeName: String, required: Boolean) {
  val propertyType: String = {
    if(required)
      typeName
    else
      s"Option[${typeName}] = None"
  }

  def methodValue: String = {
    s"  def ${Inflector.camelize(name)}: ${propertyType}"
  }

  def argumentValue: String = {
    s"    ${Inflector.camelize(name)}: ${propertyType}"
  }

  def renderedValue: String = {
    val value = if(required) s"Some(Formattable(${Inflector.camelize(name)}))" else s"${Inflector.camelize(name)}.map(Formattable(_))"
    s"""    "${name}" -> ${value}"""
  }
}

object EntryTemplate {
  def apply(uri: String, definitionTitle: Element, definitionDescription: Element): Option[EntryTemplate] = {
    for {
      name <- definitionTitle.select("code").headOption
      attributes = definitionDescription.select("em")
      required <- attributes.find(_.text.contains("Required")).flatMap(_.parent.map(p => extractContent(p.childNodes)))
      typeDescription <- attributes.find(_.text.contains("Type")).flatMap(_.parent.map(p => extractContent(p.childNodes)))
      typeName = TypeRegistry.lookup(name.text, stripSpaces(typeDescription), uri)
    } yield {
      EntryTemplate(name.text, typeName, required.toLowerCase.contains("yes"))
    }
  }

  def parse(doc: Document): Seq[EntryTemplate] =
    (for {
      (title, description) <- (doc >> elements("div.variablelist > dl > dt")).zip(
        doc >> elements("div.variablelist > dl > dd")
      )
    } yield EntryTemplate(doc.location, title, description)).flatten.toSeq

  private[this] def stripSpaces(str: String): String = {
    str.replaceAll(" +", " ").replaceAll("(^ |: +|[ \\.]+$)", "")
  }

  private[this] def extractContent(nodes: Iterable[Node]): String = {
    nodes.toSeq.drop(1).collect {
      case n: TextNode => n.content
      case e: ElementNode[_] => e.element.text
    }.mkString("")
  }
}
