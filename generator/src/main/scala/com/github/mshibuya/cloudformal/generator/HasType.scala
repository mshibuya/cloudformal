package com.github.mshibuya.cloudformal.generator

trait HasType {
  def name: String
  def itemType: Option[String]
  def primitiveType: Option[String]
  def primitiveItemType: Option[String]
  def `type`: Option[String]

  val isList: Boolean = `type`.exists(_.equals("List"))
  val isMap: Boolean = `type`.exists(_.equals("Map"))
  val isJson: Boolean = primitiveType.exists(_.equals("Json")) || primitiveItemType.exists(_.equals("Json"))

  val inferredTypeName: String =
    if (isList) {
      s"Seq[${TypeRegistry.lookup(name, primitiveItemType.orElse(itemType).get)}]"
    } else if(isMap) {
      s"ListMap[String, ${TypeRegistry.lookup(name, primitiveItemType.orElse(itemType).get)}]"
    } else {
      TypeRegistry.lookup(name, primitiveType.orElse(`type`).get)
    }
}
