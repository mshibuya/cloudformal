package com.github.mshibuya.cloudformal

sealed abstract class InstanceType(id: String)
case object M4large extends InstanceType("m4.large")
case object M4xlarge extends InstanceType("m4.xlarge")
case object M42xlarge extends InstanceType("m4.2xlarge")
