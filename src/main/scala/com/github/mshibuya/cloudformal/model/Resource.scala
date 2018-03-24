package com.github.mshibuya.cloudformal.model

import argonaut.Json
import com.github.mshibuya.cloudformal.model.policy._

trait Resource[A] extends Expression[A] with Referenceable[String] with Resource.Dependency with Resource.Metadata {
  def logicalId: String
  def resourceTypeName: String
  def render(): MapValue[_]
  override def resourcify(): MapValue[_] = Value(
    "Type" -> Value(resourceTypeName),
    "Properties" -> render()
  ) ++ super.resourcify
}

object Resource {
  trait Attribute {
    def resourcify: MapValue[_] = Value()
  }
  trait WithCreationPolicy extends Attribute {
    def creationPolicy: Property[CreationPolicy] = Empty
    override def resourcify: MapValue[_] =  super.resourcify ++ Value((creationPolicy match {
      case n: NonEmptyProperty[_] => Seq("CreationPolicy" -> n)
      case _ => Nil
    }): _*)
  }
  trait WithDeletionPolicy extends Attribute {
    def deletionPolicy: Property[DeletionPolicy.Standard] = Empty
    override def resourcify: MapValue[_] = super.resourcify ++ Value((deletionPolicy match {
      case p: NonEmptyProperty[_] => Seq("DeletionPolicy" -> p)
      case _ => Nil
    }): _*)
  }
  trait WithSnapshotableDeletionPolicy extends Attribute {
    def deletionPolicy: Property[DeletionPolicy.Snapshotable] = Empty
    override def resourcify: MapValue[_] = super.resourcify ++ Value((deletionPolicy match {
      case p: NonEmptyProperty[_] => Seq("DeletionPolicy" -> p)
      case _ => Nil
    }): _*)
  }
  trait Dependency extends Attribute {
    def dependsOn: Seq[Resource[_]] = Nil
    override def resourcify: MapValue[_] = super.resourcify ++ Value(dependsOn.headOption.map { _ =>
      Seq("DependsOn" -> Value(dependsOn.map(v => Value(v.logicalId))))
    }.getOrElse(Nil): _*)
  }
  trait Metadata extends Attribute {
    def metadata: Property[Json] = Empty
    override def resourcify: MapValue[_] = super.resourcify ++ Value((metadata match {
      case p: NonEmptyProperty[_] => Seq("Metadata" -> p)
      case _ => Nil
    }): _*)
  }
  trait WithUpdatePolicy extends Attribute {
    def updatePolicy: Property[UpdatePolicy] = Empty
    override def resourcify: MapValue[_] = super.resourcify ++ Value((updatePolicy match {
      case p: NonEmptyProperty[_] => Seq("UpdatePolicy" -> p)
      case _ => Nil
    }): _*)
  }
}