package com.github.mshibuya.cloudformal.model

import argonaut.Json
import com.github.mshibuya.cloudformal.model.policy._

trait Resource extends Renderable with Referenceable[String] with Resource.Dependency with Resource.Metadata {
  def logicalId: String
  def resourceTypeName: String
  def resourceProperties: FormattableMap
  def render(): FormattableMap = resourceProperties
  override def resourceAttributes: Seq[(String, Formattable)] = Seq(
    "Type" -> Formattable(resourceTypeName),
    "Properties" -> resourceProperties
  ) ++ super.resourceAttributes
  def resourcify(): FormattableMap = Formattable(resourceAttributes: _*)
}

object Resource {
  trait Attribute {
    def resourceAttributes: Seq[(String, Formattable)] = Nil
  }
  trait WithCreationPolicy extends Attribute {
    def creationPolicy: Property[CreationPolicy] = Empty
    override def resourceAttributes: Seq[(String, Formattable)] =  super.resourceAttributes ++ (creationPolicy match {
      case n: NonEmptyProperty[_] => Seq("CreationPolicy" -> n.render())
      case _ => Nil
    })
  }
  trait WithDeletionPolicy extends Attribute {
    def deletionPolicy: Property[DeletionPolicy.Standard] = Empty
    override def resourceAttributes: Seq[(String, Formattable)] = super.resourceAttributes ++ (deletionPolicy match {
      case p: NonEmptyProperty[_] => Seq("DeletionPolicy" -> p.render())
      case _ => Nil
    })
  }
  trait WithSnapshotableDeletionPolicy extends Attribute {
    def deletionPolicy: Property[DeletionPolicy.Snapshotable] = Empty
    override def resourceAttributes: Seq[(String, Formattable)] = super.resourceAttributes ++ (deletionPolicy match {
      case p: NonEmptyProperty[_] => Seq("DeletionPolicy" -> p.render())
      case _ => Nil
    })
  }
  trait Dependency extends Attribute {
    def dependsOn: Seq[Resource] = Nil
    override def resourceAttributes: Seq[(String, Formattable)] = super.resourceAttributes ++ dependsOn.headOption.map { _ =>
      Seq("DependsOn" -> Formattable(dependsOn.map(_.logicalId)))
    }.getOrElse(Nil)
  }
  trait Metadata extends Attribute {
    def metadata: Property[Json] = Empty
    override def resourceAttributes: Seq[(String, Formattable)] = super.resourceAttributes ++ (metadata match {
      case p: NonEmptyProperty[_] => Seq("Metadata" -> p.render())
      case _ => Nil
    })
  }
  trait WithUpdatePolicy extends Attribute {
    def updatePolicy: Property[UpdatePolicy] = Empty
    override def resourceAttributes: Seq[(String, Formattable)] = super.resourceAttributes ++ (updatePolicy match {
      case p: NonEmptyProperty[_] => Seq("UpdatePolicy" -> p.render())
      case _ => Nil
    })
  }
}