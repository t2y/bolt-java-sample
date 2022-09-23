# bolt-java-sample

Bolt for Java sample

* https://api.slack.com/start/building/bolt-java

## how to start

```bash
$ ngrok http 3000
```

confirm the host name provided by ngrok.


```bash
$ ./gradlew run -DslackLogLevel=debug
...
[main] INFO com.slack.api.bolt.jetty.SlackAppServer - ⚡️ Bolt app is running!
```

configure the URI to Event Subscriptions in slack app admin.

open app home for bolt-java-sample in slack client.

## test

```bash
$ ./gradlew test
```
