package com.github.mshibuya.cloudformal.generator

object TypeRegistry {
  def lookup(name: String, description: String, uri: String): String = {
    name match {
      case "SecurityGroups" => "Seq[String]"
      case _ =>
        description match {
          case "Boolean" => description
          case "Integer" | "Number" => "Int"
          case "String" => description
          case "List of String values" | "List of strings" => "Seq[String]"
          case "AWS CloudFormation Resource Tags" => "Seq[Tag]"

          // EC2
          case "A list of Amazon EC2 Block Device Mapping Property" => "Seq[EC2BlockDeviceMapping]"
          case "Amazon Elastic Block Store Block Device Property" => "EC2EBSBlockDevice"
          case "List of EC2 NetworkInterface Ipv6Addresses" => "Seq[EC2NetworkInterfaceIpv6Addresses]"
          case "A list of EC2 NetworkInterface Embedded Property Type" => "Seq[EC2NetworkInterface]"
          case "list of PrivateIpAddressSpecification" => "Seq[PrivateIpAddressSpecification]"
          case "List of Amazon EC2 Instance SsmAssociations" => "Seq[EC2InstanceSsmAssociations]"
          case "List of Amazon EC2 Instance SsmAssociations AssociationParameters" => "Seq[EC2InstanceSsmAssociationsAssociationParameters]"
          case "A list of EC2 MountPoints" => "Seq[EC2MountPoint]"
          case "List of EC2 Security Group Rule" => "Seq[EC2SecurityGroupRule]"
          case "Ref ID" => "Ref"

          case t => {
            println(s"Unknown type: '${t}' in ${uri}")
            "String"
          }
        }
    }
  }
}
