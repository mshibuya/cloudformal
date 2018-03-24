package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html
 */

case class Action(
    cloudwatchAlarm: Property[CloudwatchAlarmAction] = Empty,
    cloudwatchMetric: Property[CloudwatchMetricAction] = Empty,
    dynamoDB: Property[DynamoDBAction] = Empty,
    dynamoDBv2: Property[DynamoDBv2Action] = Empty,
    elasticsearch: Property[ElasticsearchAction] = Empty,
    firehose: Property[FirehoseAction] = Empty,
    kinesis: Property[KinesisAction] = Empty,
    lambda: Property[LambdaAction] = Empty,
    republish: Property[RepublishAction] = Empty,
    s3: Property[S3Action] = Empty,
    sns: Property[SnsAction] = Empty,
    sqs: Property[SqsAction] = Empty) extends Expression[Action] {
  def render: Formattable = Value(
    "CloudwatchAlarm" -> cloudwatchAlarm,
    "CloudwatchMetric" -> cloudwatchMetric,
    "DynamoDB" -> dynamoDB,
    "DynamoDBv2" -> dynamoDBv2,
    "Elasticsearch" -> elasticsearch,
    "Firehose" -> firehose,
    "Kinesis" -> kinesis,
    "Lambda" -> lambda,
    "Republish" -> republish,
    "S3" -> s3,
    "Sns" -> sns,
    "Sqs" -> sqs
  )
}
