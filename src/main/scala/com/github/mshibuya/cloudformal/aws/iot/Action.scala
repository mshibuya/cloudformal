package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html
 */

case class Action(
    cloudwatchAlarm: Option[CloudwatchAlarmAction] = None,
    cloudwatchMetric: Option[CloudwatchMetricAction] = None,
    dynamoDB: Option[DynamoDBAction] = None,
    dynamoDBv2: Option[DynamoDBv2Action] = None,
    elasticsearch: Option[ElasticsearchAction] = None,
    firehose: Option[FirehoseAction] = None,
    kinesis: Option[KinesisAction] = None,
    lambda: Option[LambdaAction] = None,
    republish: Option[RepublishAction] = None,
    s3: Option[S3Action] = None,
    sns: Option[SnsAction] = None,
    sqs: Option[SqsAction] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "CloudwatchAlarm" -> cloudwatchAlarm.map(Formattable(_)),
    "CloudwatchMetric" -> cloudwatchMetric.map(Formattable(_)),
    "DynamoDB" -> dynamoDB.map(Formattable(_)),
    "DynamoDBv2" -> dynamoDBv2.map(Formattable(_)),
    "Elasticsearch" -> elasticsearch.map(Formattable(_)),
    "Firehose" -> firehose.map(Formattable(_)),
    "Kinesis" -> kinesis.map(Formattable(_)),
    "Lambda" -> lambda.map(Formattable(_)),
    "Republish" -> republish.map(Formattable(_)),
    "S3" -> s3.map(Formattable(_)),
    "Sns" -> sns.map(Formattable(_)),
    "Sqs" -> sqs.map(Formattable(_))
  )
}
