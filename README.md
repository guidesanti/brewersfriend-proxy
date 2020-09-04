# Brewers Firend Proxy API
A proxy to post stream data do Brewers Friend API

## Requirements

* Java 11
* Maven 3.0.5

## Setup
```shell script
export JAVA_HOME=/opt/jdk-11.0.5
```

## Build

```shell script
mvn clean package
```

## Deploy

### Create lambda
```shell script
aws lambda create-function --function-name brewersfirend-forwarder --runtime java11 --memory-size 256 --timeout 30 --role arn:aws:iam::635351935778:role/service-role/brewersfriend-forwarder-role-hdfwws2y --zip-file fileb://./functions/target/functions.jar --handler br.com.eventhorizon.brewersfriendproxy.forward.ForwardRequestHandler::handleRequest --profile [AWS_PROFILE] --region [AWS_REGION]
```

### Update lambda
```shell script
aws lambda update-function-code --function-name brewersfirend-forwarder --zip-file fileb://./functions/target/functions.jar --profile [AWS_PROFILE] --region [AWS_REGION]
```

## Test

### Unit tests
```shell script
mvn clean verify -P UnitTests
```

### Integration tests

```shell script
mvn clean verify -P BddTests -Dbr.com.eventhorizon.brewersfriendproxy.story.path=jbehave/stories/*.story -DskipUnitTests=true -Dbr.com.eventhorizon.brewersfriendproxy.url=https://blablabla.execute-api.us-east-1.amazonaws.com/dev -am -pl integration-tests
```

### Invoke lambda
```shell script
aws lambda invoke --function-name brewersfirend-forwarder --payload file://./functions/src/test/resources/payload.examples/forward.json output.json --profile [AWS_PROFILE] --region [AWS_REGION] --cli-binary-format raw-in-base64-out
```

## Versions Plugin

### Check plugin updates
```shell script
mvn versions:display-plugin-updates
```

### Check dependency updates
```shell script
mvn versions:display-dependency-updates
```
