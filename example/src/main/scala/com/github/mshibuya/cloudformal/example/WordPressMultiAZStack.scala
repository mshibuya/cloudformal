package com.github.mshibuya.cloudformal.example

import argonaut._
import com.github.mshibuya.cloudformal.aws.autoscaling.{AutoScalingGroup, LaunchConfiguration}
import com.github.mshibuya.cloudformal.aws.ec2.{Ingress, SecurityGroup}
import com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2._
import com.github.mshibuya.cloudformal.aws.rds.DBInstance
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._
import com.github.mshibuya.cloudformal.model.Implicits._

/**
  * AWS CloudFormation Sample template from: https://s3.amazonaws.com/cloudformation-templates-us-east-1/WordPress_Multi_AZ.template
  */

object WordPressMultiAZStack extends Stack {
  val name = "WordPressMultiAZ"
  def description = "AWS CloudFormation Sample Template WordPress_Multi_AZ: WordPress is web software you can use to create a beautiful website or blog. This template installs a highly-available, scalable WordPress deployment using a multi-az Amazon RDS database instance for storage. It demonstrates using the AWS CloudFormation bootstrap scripts to deploy WordPress. **WARNING** This template creates an Amazon EC2 instance, an Application Load Balancer and an Amazon RDS database instance. You will be billed for the AWS resources used if you create a stack from this template."

  val vpcId = TypedParameter(
    logicalId = "VpcId",
    dataType = "AWS::EC2::VPC::Id",
    description = "VpcId of your existing Virtual Private Cloud (VPC)",
    constraintDescription = "must be the VPC Id of an existing Virtual Private Cloud."
  )
  val subnets = TypedListParameter(
    logicalId = "Subnets",
    dataType = "List<AWS::EC2::Subnet::Id>",
    description = "The list of SubnetIds in your Virtual Private Cloud (VPC)",
    constraintDescription = "must be a list of at least two existing subnets associated with at least two different availability zones. They should be residing in the selected Virtual Private Cloud."
  )
  val keyName = TypedParameter(
    logicalId = "KeyName",
    dataType = "AWS::EC2::KeyPair::KeyName",
    description = "Name of an existing EC2 KeyPair to enable SSH access to the instances",
    constraintDescription = "must be the name of an existing EC2 KeyPair."
  )
  val instanceType = StringParameter(
    logicalId = "InstanceType",
    description = "WebServer EC2 instance type",
    default = "t2.small",
    allowedValues = Seq("t1.micro", "t2.nano", "t2.micro", "t2.small", "t2.medium", "t2.large", "m1.small", "m1.medium", "m1.large", "m1.xlarge", "m2.xlarge", "m2.2xlarge", "m2.4xlarge", "m3.medium", "m3.large", "m3.xlarge", "m3.2xlarge", "m4.large", "m4.xlarge", "m4.2xlarge", "m4.4xlarge", "m4.10xlarge", "c1.medium", "c1.xlarge", "c3.large", "c3.xlarge", "c3.2xlarge", "c3.4xlarge", "c3.8xlarge", "c4.large", "c4.xlarge", "c4.2xlarge", "c4.4xlarge", "c4.8xlarge", "g2.2xlarge", "g2.8xlarge", "r3.large", "r3.xlarge", "r3.2xlarge", "r3.4xlarge", "r3.8xlarge", "i2.xlarge", "i2.2xlarge", "i2.4xlarge", "i2.8xlarge", "d2.xlarge", "d2.2xlarge", "d2.4xlarge", "d2.8xlarge", "hi1.4xlarge", "hs1.8xlarge", "cr1.8xlarge", "cc2.8xlarge", "cg1.4xlarge"),
    constraintDescription = "must be a valid EC2 instance type."
  )
  val sshLocation = StringParameter(
    logicalId = "SSHLocation",
    description = "The IP address range that can be used to SSH to the EC2 instances",
    minLength = 9,
    maxLength = 18,
    default = "0.0.0.0/0",
    allowedPattern = "(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})/(\\d{1,2})",
    constraintDescription = "must be a valid IP CIDR range of the form x.x.x.x/x."
  )
  val dbClass = StringParameter(
    logicalId = "DBClass",
    description = "Database instance class",
    default = "db.t2.small",
    allowedValues = Seq("db.t1.micro", "db.m1.small", "db.m1.medium", "db.m1.large", "db.m1.xlarge", "db.m2.xlarge", "db.m2.2xlarge", "db.m2.4xlarge", "db.m3.medium", "db.m3.large", "db.m3.xlarge", "db.m3.2xlarge", "db.m4.large", "db.m4.xlarge", "db.m4.2xlarge", "db.m4.4xlarge", "db.m4.10xlarge", "db.r3.large", "db.r3.xlarge", "db.r3.2xlarge", "db.r3.4xlarge", "db.r3.8xlarge", "db.m2.xlarge", "db.m2.2xlarge", "db.m2.4xlarge", "db.cr1.8xlarge", "db.t2.micro", "db.t2.small", "db.t2.medium", "db.t2.large"),
    constraintDescription = "must select a valid database instance type."
  )
  val dbName = StringParameter(
    logicalId = "DBName",
    default = "wordpressdb",
    description = "The WordPress database name",
    minLength = 1,
    maxLength = 64,
    allowedPattern = "[a-zA-Z][a-zA-Z0-9]*",
    constraintDescription = "must begin with a letter and contain only alphanumeric characters."
  )
  val dbUser = StringParameter(
    logicalId = "DBUser",
    noEcho = true,
    description = "The WordPress database admin account username",
    minLength = 1,
    maxLength= 16,
    allowedPattern = "[a-zA-Z][a-zA-Z0-9]*",
    constraintDescription = "must begin with a letter and contain only alphanumeric characters."
  )
  val dbPassword = StringParameter(
    logicalId = "DBPassword",
    noEcho = true,
    description = "The WordPress database admin account password",
    minLength = 8,
    maxLength= 41,
    allowedPattern = "[a-zA-Z0-9]*",
    constraintDescription = "must contain only alphanumeric characters."
  )
  val multiAZDatabase = StringParameter(
    logicalId = "MultiAZDatabase",
    default = "false",
    description = "Create a Multi-AZ MySQL Amazon RDS database instance",
    allowedValues = Seq("true", "false"),
    constraintDescription = "must be either true or false."
  )
  val webServerCapacity = NumberParameter(
    logicalId = "WebServerCapacity",
    default = 1,
    description = "The initial number of WebServer instances",
    minValue = 1,
    maxValue = 5,
    constraintDescription = "must be between 1 and 5 EC2 instances."
  )
  val dbAllocatedStorage = NumberParameter(
    logicalId = "DBAllocatedStorage",
    default = 5,
    description = "The size of the database (Gb)",
    minValue = 5,
    maxValue = 1024,
    constraintDescription = "must be between 5 and 1024Gb."
  )

  val awsInstanceType2Arch = StringMapping(
    logicalId = "AWSInstanceType2Arch",
    value = Map(
      "t1.micro"    -> Map("Arch" -> "PV64"),
      "t2.nano"     -> Map("Arch" -> "HVM64"),
      "t2.micro"    -> Map("Arch" -> "HVM64"),
      "t2.small"    -> Map("Arch" -> "HVM64"),
      "t2.medium"   -> Map("Arch" -> "HVM64"),
      "t2.large"    -> Map("Arch" -> "HVM64"),
      "m1.small"    -> Map("Arch" -> "PV64"),
      "m1.medium"   -> Map("Arch" -> "PV64"),
      "m1.large"    -> Map("Arch" -> "PV64"),
      "m1.xlarge"   -> Map("Arch" -> "PV64"),
      "m2.xlarge"   -> Map("Arch" -> "PV64"),
      "m2.2xlarge"  -> Map("Arch" -> "PV64"),
      "m2.4xlarge"  -> Map("Arch" -> "PV64"),
      "m3.medium"   -> Map("Arch" -> "HVM64"),
      "m3.large"    -> Map("Arch" -> "HVM64"),
      "m3.xlarge"   -> Map("Arch" -> "HVM64"),
      "m3.2xlarge"  -> Map("Arch" -> "HVM64"),
      "m4.large"    -> Map("Arch" -> "HVM64"),
      "m4.xlarge"   -> Map("Arch" -> "HVM64"),
      "m4.2xlarge"  -> Map("Arch" -> "HVM64"),
      "m4.4xlarge"  -> Map("Arch" -> "HVM64"),
      "m4.10xlarge" -> Map("Arch" -> "HVM64"),
      "c1.medium"   -> Map("Arch" -> "PV64"),
      "c1.xlarge"   -> Map("Arch" -> "PV64"),
      "c3.large"    -> Map("Arch" -> "HVM64"),
      "c3.xlarge"   -> Map("Arch" -> "HVM64"),
      "c3.2xlarge"  -> Map("Arch" -> "HVM64"),
      "c3.4xlarge"  -> Map("Arch" -> "HVM64"),
      "c3.8xlarge"  -> Map("Arch" -> "HVM64"),
      "c4.large"    -> Map("Arch" -> "HVM64"),
      "c4.xlarge"   -> Map("Arch" -> "HVM64"),
      "c4.2xlarge"  -> Map("Arch" -> "HVM64"),
      "c4.4xlarge"  -> Map("Arch" -> "HVM64"),
      "c4.8xlarge"  -> Map("Arch" -> "HVM64"),
      "g2.2xlarge"  -> Map("Arch" -> "HVMG2"),
      "g2.8xlarge"  -> Map("Arch" -> "HVMG2"),
      "r3.large"    -> Map("Arch" -> "HVM64"),
      "r3.xlarge"   -> Map("Arch" -> "HVM64"),
      "r3.2xlarge"  -> Map("Arch" -> "HVM64"),
      "r3.4xlarge"  -> Map("Arch" -> "HVM64"),
      "r3.8xlarge"  -> Map("Arch" -> "HVM64"),
      "i2.xlarge"   -> Map("Arch" -> "HVM64"),
      "i2.2xlarge"  -> Map("Arch" -> "HVM64"),
      "i2.4xlarge"  -> Map("Arch" -> "HVM64"),
      "i2.8xlarge"  -> Map("Arch" -> "HVM64"),
      "d2.xlarge"   -> Map("Arch" -> "HVM64"),
      "d2.2xlarge"  -> Map("Arch" -> "HVM64"),
      "d2.4xlarge"  -> Map("Arch" -> "HVM64"),
      "d2.8xlarge"  -> Map("Arch" -> "HVM64"),
      "hi1.4xlarge" -> Map("Arch" -> "HVM64"),
      "hs1.8xlarge" -> Map("Arch" -> "HVM64"),
      "cr1.8xlarge" -> Map("Arch" -> "HVM64"),
      "cc2.8xlarge" -> Map("Arch" -> "HVM64")
 ))

  val awsInstanceType2NATArch = StringMapping(
    logicalId = "AWSInstanceType2NATArch",
    value = Map(
      "t1.micro"    -> Map("Arch" -> "NATPV64"),
      "t2.nano"     -> Map("Arch" -> "NATHVM64"),
      "t2.micro"    -> Map("Arch" -> "NATHVM64"),
      "t2.small"    -> Map("Arch" -> "NATHVM64"),
      "t2.medium"   -> Map("Arch" -> "NATHVM64"),
      "t2.large"    -> Map("Arch" -> "NATHVM64"),
      "m1.small"    -> Map("Arch" -> "NATPV64"),
      "m1.medium"   -> Map("Arch" -> "NATPV64"),
      "m1.large"    -> Map("Arch" -> "NATPV64"),
      "m1.xlarge"   -> Map("Arch" -> "NATPV64"),
      "m2.xlarge"   -> Map("Arch" -> "NATPV64"),
      "m2.2xlarge"  -> Map("Arch" -> "NATPV64"),
      "m2.4xlarge"  -> Map("Arch" -> "NATPV64"),
      "m3.medium"   -> Map("Arch" -> "NATHVM64"),
      "m3.large"    -> Map("Arch" -> "NATHVM64"),
      "m3.xlarge"   -> Map("Arch" -> "NATHVM64"),
      "m3.2xlarge"  -> Map("Arch" -> "NATHVM64"),
      "m4.large"    -> Map("Arch" -> "NATHVM64"),
      "m4.xlarge"   -> Map("Arch" -> "NATHVM64"),
      "m4.2xlarge"  -> Map("Arch" -> "NATHVM64"),
      "m4.4xlarge"  -> Map("Arch" -> "NATHVM64"),
      "m4.10xlarge" -> Map("Arch" -> "NATHVM64"),
      "c1.medium"   -> Map("Arch" -> "NATPV64"),
      "c1.xlarge"   -> Map("Arch" -> "NATPV64"),
      "c3.large"    -> Map("Arch" -> "NATHVM64"),
      "c3.xlarge"   -> Map("Arch" -> "NATHVM64"),
      "c3.2xlarge"  -> Map("Arch" -> "NATHVM64"),
      "c3.4xlarge"  -> Map("Arch" -> "NATHVM64"),
      "c3.8xlarge"  -> Map("Arch" -> "NATHVM64"),
      "c4.large"    -> Map("Arch" -> "NATHVM64"),
      "c4.xlarge"   -> Map("Arch" -> "NATHVM64"),
      "c4.2xlarge"  -> Map("Arch" -> "NATHVM64"),
      "c4.4xlarge"  -> Map("Arch" -> "NATHVM64"),
      "c4.8xlarge"  -> Map("Arch" -> "NATHVM64"),
      "g2.2xlarge"  -> Map("Arch" -> "NATHVMG2"),
      "g2.8xlarge"  -> Map("Arch" -> "NATHVMG2"),
      "r3.large"    -> Map("Arch" -> "NATHVM64"),
      "r3.xlarge"   -> Map("Arch" -> "NATHVM64"),
      "r3.2xlarge"  -> Map("Arch" -> "NATHVM64"),
      "r3.4xlarge"  -> Map("Arch" -> "NATHVM64"),
      "r3.8xlarge"  -> Map("Arch" -> "NATHVM64"),
      "i2.xlarge"   -> Map("Arch" -> "NATHVM64"),
      "i2.2xlarge"  -> Map("Arch" -> "NATHVM64"),
      "i2.4xlarge"  -> Map("Arch" -> "NATHVM64"),
      "i2.8xlarge"  -> Map("Arch" -> "NATHVM64"),
      "d2.xlarge"   -> Map("Arch" -> "NATHVM64"),
      "d2.2xlarge"  -> Map("Arch" -> "NATHVM64"),
      "d2.4xlarge"  -> Map("Arch" -> "NATHVM64"),
      "d2.8xlarge"  -> Map("Arch" -> "NATHVM64"),
      "hi1.4xlarge" -> Map("Arch" -> "NATHVM64"),
      "hs1.8xlarge" -> Map("Arch" -> "NATHVM64"),
      "cr1.8xlarge" -> Map("Arch" -> "NATHVM64"),
      "cc2.8xlarge" -> Map("Arch" -> "NATHVM64")
    ))

  val awsRegionArch2AMI = StringMapping(
    logicalId = "AWSRegionArch2AMI",
    value = Map(
      "us-east-1"        -> Map("PV64" -> "ami-2a69aa47", "HVM64" -> "ami-6869aa05", "HVMG2" -> "ami-3353c649"),
      "us-west-2"        -> Map("PV64" -> "ami-7f77b31f", "HVM64" -> "ami-7172b611", "HVMG2" -> "ami-58ce1220"),
      "us-west-1"        -> Map("PV64" -> "ami-a2490dc2", "HVM64" -> "ami-31490d51", "HVMG2" -> "ami-62ad9502"),
      "eu-west-1"        -> Map("PV64" -> "ami-4cdd453f", "HVM64" -> "ami-f9dd458a", "HVMG2" -> "ami-41bc0a38"),
      "eu-west-2"        -> Map("PV64" -> "NOT_SUPPORTED", "HVM64" -> "ami-886369ec", "HVMG2" -> "NOT_SUPPORTED"),
      "eu-west-3"        -> Map("PV64" -> "NOT_SUPPORTED", "HVM64" -> "NOT_SUPPORTED", "HVMG2" -> "NOT_SUPPORTED"),
      "eu-central-1"     -> Map("PV64" -> "ami-6527cf0a", "HVM64" -> "ami-ea26ce85", "HVMG2" -> "ami-b50d8fda"),
      "ap-northeast-1"   -> Map("PV64" -> "ami-3e42b65f", "HVM64" -> "ami-374db956", "HVMG2" -> "ami-14e45872"),
      "ap-northeast-2"   -> Map("PV64" -> "NOT_SUPPORTED", "HVM64" -> "ami-2b408b45", "HVMG2" -> "NOT_SUPPORTED"),
      "ap-southeast-1"   -> Map("PV64" -> "ami-df9e4cbc", "HVM64" -> "ami-a59b49c6", "HVMG2" -> "ami-2a80d649"),
      "ap-southeast-2"   -> Map("PV64" -> "ami-63351d00", "HVM64" -> "ami-dc361ebf", "HVMG2" -> "ami-02c42e60"),
      "ap-south-1"       -> Map("PV64" -> "NOT_SUPPORTED", "HVM64" -> "ami-ffbdd790", "HVMG2" -> "ami-f6165899"),
      "us-east-2"        -> Map("PV64" -> "NOT_SUPPORTED", "HVM64" -> "ami-f6035893", "HVMG2" -> "NOT_SUPPORTED"),
      "ca-central-1"     -> Map("PV64" -> "NOT_SUPPORTED", "HVM64" -> "ami-730ebd17", "HVMG2" -> "NOT_SUPPORTED"),
      "sa-east-1"        -> Map("PV64" -> "ami-1ad34676", "HVM64" -> "ami-6dd04501", "HVMG2" -> "NOT_SUPPORTED"),
      "cn-north-1"       -> Map("PV64" -> "ami-77559f1a", "HVM64" -> "ami-8e6aa0e3", "HVMG2" -> "NOT_SUPPORTED"),
      "cn-northwest-1"   -> Map("PV64" -> "ami-80707be2", "HVM64" -> "ami-cb858fa9", "HVMG2" -> "NOT_SUPPORTED")
    ))

  val applicationLoadBalancer = new LoadBalancer {
    override def logicalId: String = "ApplicationLoadBalancer"
    override def subnets = WordPressMultiAZStack.subnets.ref
  }
  val albListener = new Listener {
    override def logicalId: String = "ALBListener"
    override def defaultActions: NonEmptyProperty[Seq[Action]] = Seq(
      Action(targetGroupArn = albTargetGroup.ref, `type` = "forward")
    )
    override def loadBalancerArn: NonEmptyProperty[String] = applicationLoadBalancer.ref
    override def protocol: NonEmptyProperty[String] = "HTTP"
    override def port: NonEmptyProperty[Int] = 80
  }
  val albTargetGroup = new TargetGroup {
    override def logicalId: String = "ALBTargetGroup"
    override def port: NonEmptyProperty[Int] = 80
    override def protocol: NonEmptyProperty[String] = "HTTP"
    override def vpcId: NonEmptyProperty[String] = WordPressMultiAZStack.vpcId.ref
    override def healthCheckPath: Property[String] = "/wordpress/wp-admin/install.php"
    override def healthCheckIntervalSeconds: Property[Int] = 10
    override def healthCheckTimeoutSeconds: Property[Int] = 5
    override def healthyThresholdCount: Property[Int] = 2
    override def unhealthyThresholdCount: Property[Int] = 5
    override def targetGroupAttributes: Property[Seq[TargetGroupAttribute]] = Seq(
      TargetGroupAttribute("stickiness.enabled", "true"),
      TargetGroupAttribute("stickiness.type", "lb_cookie"),
      TargetGroupAttribute("stickiness.lb_cookie.duration_seconds", "30"),
    )
  }
  val webServerSecurityGroup = new SecurityGroup {
    override def logicalId: String = "WebServerSecurityGroup"
    override def groupDescription: NonEmptyProperty[String] = "Enable HTTP access via port 80 locked down to the load balancer + SSH access"
    override def securityGroupIngress: Property[Seq[Ingress]] = Seq(
      Ingress(ipProtocol = "tcp", fromPort = 80, toPort = 80, sourceSecurityGroupId = Fn.Select(0, applicationLoadBalancer.attributes.securityGroups)),
      Ingress(ipProtocol = "tcp", fromPort = 22, toPort = 22, cidrIp = sshLocation.ref)
    )
    override def vpcId: Property[String] = WordPressMultiAZStack.vpcId.ref
  }

  val webServerGroup = new AutoScalingGroup {
    override def logicalId: String = "WebServerGroup"
    override def maxSize: NonEmptyProperty[String] = "5"
    override def minSize: NonEmptyProperty[String] = "1"
    override def vpcZoneIdentifier: Property[Seq[String]] = subnets.ref
    override def launchConfigurationName: Property[String] = launchConfig.ref
    override def desiredCapacity: Property[String] = webServerCapacity.ref.as[String]
    override def targetGroupARNs: Property[Seq[String]] = Seq(albTargetGroup.ref)
    override def creationPolicy: Property[CreationPolicy] = CreationPolicy(resourceSignal = ResourceSignal(timeout = "PT15M"))
    override def updatePolicy: Property[UpdatePolicy] = UpdatePolicy(autoScalingRollingUpdate = AutoScalingRollingUpdate(
      minInstancesInService = 1, maxBatchSize = 1, pauseTime = "PT15M", waitOnResourceSignals = true)
    )
  }
  val launchConfig = new LaunchConfiguration {
    override def logicalId: String = "LaunchConfig"
    override val metadata: Property[Json] = Parse.parse("""
      |{
      |  "AWS::CloudFormation::Init" : {
      |    "configSets" : {
      |      "wordpress_install" : ["install_cfn", "install_wordpress" ]
      |    },
      |    "install_cfn" : {
      |      "files": {
      |        "/etc/cfn/cfn-hup.conf": {
      |          "content": { "Fn::Join": [ "", [
      |            "[main]\n",
      |            "stack=", { "Ref": "AWS::StackId" }, "\n",
      |            "region=", { "Ref": "AWS::Region" }, "\n"
      |          ]]},
      |          "mode"  : "000400",
      |          "owner" : "root",
      |          "group" : "root"
      |        },
      |        "/etc/cfn/hooks.d/cfn-auto-reloader.conf": {
      |          "content": { "Fn::Join": [ "", [
      |            "[cfn-auto-reloader-hook]\n",
      |            "triggers=post.update\n",
      |            "path=Resources.LaunchConfig.Metadata.AWS::CloudFormation::Init\n",
      |            "action=/opt/aws/bin/cfn-init -v ",
      |                    "         --stack ", { "Ref" : "AWS::StackName" },
      |                    "         --resource LaunchConfig ",
      |                    "         --configsets wordpress_install ",
      |                    "         --region ", { "Ref" : "AWS::Region" }, "\n"
      |          ]]},
      |          "mode"  : "000400",
      |          "owner" : "root",
      |          "group" : "root"
      |        }
      |      },
      |      "services" : {
      |        "sysvinit" : {
      |          "cfn-hup" : { "enabled" : "true", "ensureRunning" : "true",
      |                        "files" : ["/etc/cfn/cfn-hup.conf", "/etc/cfn/hooks.d/cfn-auto-reloader.conf"]}
      |        }
      |      }
      |    },
      |
      |    "install_wordpress" : {
      |      "packages" : {
      |        "yum" : {
      |          "php"       : [],
      |          "php-mysql" : [],
      |          "mysql"     : [],
      |          "httpd"     : []
      |        }
      |      },
      |      "sources" : {
      |        "/var/www/html" : "http://wordpress.org/latest.tar.gz"
      |      },
      |      "files" : {
      |        "/tmp/create-wp-config" : {
      |          "content" : { "Fn::Join" : [ "", [
      |            "#!/bin/bash\n",
      |            "cp /var/www/html/wordpress/wp-config-sample.php /var/www/html/wordpress/wp-config.php\n",
      |            "sed -i \"s/'database_name_here'/'",{ "Ref" : "DBName" }, "'/g\" wp-config.php\n",
      |            "sed -i \"s/'username_here'/'",{ "Ref" : "DBUser" }, "'/g\" wp-config.php\n",
      |            "sed -i \"s/'password_here'/'",{ "Ref" : "DBPassword" }, "'/g\" wp-config.php\n",
      |            "sed -i \"s/'localhost'/'",{ "Fn::GetAtt" : [ "DBInstance", "Endpoint.Address" ] }, "'/g\" wp-config.php\n"
      |          ]]},
      |          "mode" : "000500",
      |          "owner" : "root",
      |          "group" : "root"
      |        }
      |      },
      |      "commands" : {
      |        "01_configure_wordpress" : {
      |          "command" : "/tmp/create-wp-config",
      |          "cwd" : "/var/www/html/wordpress"
      |        }
      |      },
      |      "services" : {
      |        "sysvinit" : {
      |          "httpd" : { "enabled" : "true", "ensureRunning" : "true" }
      |        }
      |      }
      |    }
      |  }
      |}""".stripMargin).right.get
    override def imageId: NonEmptyProperty[String] = awsRegionArch2AMI.get(Ref("AWS::Region"),
      awsInstanceType2Arch.get(WordPressMultiAZStack.instanceType.ref, "Arch"))
    override def instanceType: NonEmptyProperty[String] = WordPressMultiAZStack.instanceType.ref
    override def securityGroups: Property[Seq[String]] = Seq(webServerSecurityGroup.ref)
    override def keyName: Property[String] = WordPressMultiAZStack.keyName.ref
    override def userData: Property[String] = Fn.Base64(Fn.Join("", Seq[Property[String]](
      "#!/bin/bash -xe\n",
      "yum update -y aws-cfn-bootstrap\n",
      "/opt/aws/bin/cfn-init -v ",
      "         --stack ", Ref("AWS::StackName"),
      "         --resource LaunchConfig ",
      "         --configsets wordpress_install ",
      "         --region ", Ref("AWS::Region"), "\n",
      "/opt/aws/bin/cfn-signal -e $? ",
      "         --stack ", Ref("AWS::StackName"),
      "         --resource WebServerGroup ",
      "         --region ", Ref("AWS::Region"), "\n"
    )))
  }
  val dbEC2SecurityGroup = new SecurityGroup {
    override def logicalId: String = "DBEC2SecurityGroup"
    override def groupDescription: NonEmptyProperty[String] = "Open database for access"
    override def securityGroupIngress: Property[Seq[Ingress]] = Seq(
      Ingress(ipProtocol = "tcp", fromPort = 3306, toPort = 3306, sourceSecurityGroupId = webServerSecurityGroup.ref)
    )
    override def vpcId: Property[String] = WordPressMultiAZStack.vpcId.ref
  }
  val dbInstance = new DBInstance {
    override def logicalId: String = "DBInstance"

    override def dbName: Property[String] = WordPressMultiAZStack.dbName.ref
    override def engine: Property[String] = "MySQL"
    override def multiAZ: Property[Boolean] = multiAZDatabase.ref.as[Boolean]
    override def masterUsername: Property[String] = WordPressMultiAZStack.dbUser.ref
    override def masterUserPassword: Property[String] = WordPressMultiAZStack.dbPassword.ref
    override def dbInstanceClass: NonEmptyProperty[String] = dbClass.ref
    override def allocatedStorage: Property[String] = dbAllocatedStorage.ref.as[String]
    override def vpcSecurityGroups: Property[Seq[String]] = Seq(dbEC2SecurityGroup.attributes.groupId)
  }

  val websiteUrl = Output("WebsiteURL",
    Fn.Join("", Seq[Property[String]]("http://", applicationLoadBalancer.attributes.dnsName, "/wordpress")),
    "WordPress Website")

  val parameters: Seq[Parameter[_, _]] = Macros.parametersIn(this)
  val mappings: Seq[Mapping] = Macros.mappingsIn(this)
  val resources: Seq[Resource[_]] = Macros.resourcesIn(this)
  val outputs: Seq[Output[_]] = Macros.outputsIn(this)
}
