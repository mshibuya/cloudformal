package com.github.mshibuya.cloudformal.generator

case class ResourceTemplate(name: String, specification: ResourceSpecification) {
  def nameParts: Seq[String] = name.split("::")
  def packageName = s"com.github.mshibuya.cloudformal.${nameParts.slice(0, 2).map(_.toLowerCase).mkString(".")}"
  def traitName = nameParts(2)
  def fileName = s"${nameParts(2)}.scala"
  def nameConflictsWithResource: Boolean = nameParts(1).equals("ApiGateway")
  def resourceClassName: String = if (nameConflictsWithResource) "model.Resource" else "Resource"
  def supportsCreationPolicy: Boolean = Set(
    "AWS::AutoScaling::AutoScalingGroup",
    "AWS::EC2::Instance",
    "AWS::CloudFormation::WaitCondition"
  ).contains(name)
  def supportsSnapshotOnDeletion: Boolean = Set(
    "AWS::EC2::Volume",
    "AWS::ElastiCache::CacheCluster",
    "AWS::ElastiCache::ReplicationGroup",
    "AWS::RDS::DBInstance",
    "AWS::RDS::DBCluster",
    "AWS::Redshift::Cluster"
  ).contains(name)
  def supportsUpdatePolicy: Boolean = Set(
    "AWS::AutoScaling::AutoScalingGroup",
    "AWS::Lambda::Alias"
  ).contains(name)
  def policyMixins: String = Seq(
    if (supportsCreationPolicy) s" with ${resourceClassName}.WithCreationPolicy" else "",
    if (supportsSnapshotOnDeletion) s" with ${resourceClassName}.WithSnapshotableDeletionPolicy" else s" with ${resourceClassName}.WithDeletionPolicy",
    if (supportsUpdatePolicy) s" with ${resourceClassName}.WithUpdatePolicy" else ""
  ).mkString("")
  def propertySection: String =
    if (specification.properties.isEmpty) {
      s"""  def render(): MapValue[_] = Value()"""
    } else {
      s"""  def render(): MapValue[_] = Value(
         |${specification.properties.map(_.renderedValue).mkString(",\n")}
         |  )""".stripMargin
    }

  def render: String = {
    s"""package ${packageName}
      |${if (specification.attributes.exists(_.isJson) || specification.properties.exists(_.isJson)) "\nimport argonaut.Json" else ""}${if (nameConflictsWithResource) "\nimport com.github.mshibuya.cloudformal.model" else ""}
      |import com.github.mshibuya.cloudformal.model._
      |import com.github.mshibuya.cloudformal.model.policy._
      |${if (specification.properties.exists(_.isMap)) "\nimport scala.collection.immutable.ListMap\n" else ""}
      |/**
      | * ${specification.documentation}
      | */
      |
      |trait ${traitName} extends ${resourceClassName}[${traitName}]${policyMixins} {
      |  val resourceTypeName = "${name}"
      |${if (specification.attributes.nonEmpty) s"\n  object attributes {\n${specification.attributes.map(_.methodValue).mkString("\n")}\n  }\n" else ""}
      |${specification.properties.map(_.methodValue).mkString("\n")}
      |
      |${propertySection}
      |}
      |""".stripMargin

  }
}
