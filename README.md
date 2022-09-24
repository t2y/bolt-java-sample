# bolt-java-sample

Bolt for Java sample

* https://api.slack.com/start/building/bolt-java
* https://slack.dev/java-slack-sdk/guides/supported-web-frameworks

## how to start

```bash
$ ngrok http 3000
```

confirm the host name provided by ngrok.

```bash
$ ./gradlew quarkusDev 
...
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2022-09-24 14:32:26,278 INFO  [io.quarkus] (Quarkus Main Thread) app unspecified on JVM (powered by Quarkus 2.12.0.Final) started in 1.111s. Listening on: http://localhost:3000
2022-09-24 14:32:26,287 INFO  [io.quarkus] (Quarkus Main Thread) Profile dev activated. Live Coding activated.
2022-09-24 14:32:26,287 INFO  [io.quarkus] (Quarkus Main Thread) Installed features: [cdi, config-yaml, servlet, smallrye-context-propagation, vertx]
```

configure the URI (`http://${YOUR_HOST}.ngrok.io/slack/events`) in slack app admin.

* Slash Commands
* Event Subscriptions

open app home for bolt-java-sample, or input `/hello` command on message box in your slack client.

## test

```bash
$ ./gradlew test
```
