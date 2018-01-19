#**_Slack Messenger_**

###**_About_**

This is a **_WORK IN PROGRESS_**
\n
Simple library to send slack messages

###**_Usage_**


To send a message follow the sample code:

``` java
// Create Slack Context
SlackContext context = SlackContext
        .fromEndpoint("https://hooks.slack.com/services/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");

// Create Message
SlackMessage message = SlackMessage.builder()
        .to("#general")
        .from("SlackBot")
        .messageIcon(":ghost:")
        .messageContent("Hello World")
        .build();

// Send Slack Message
SlackMessengerService.sendMessage(
        context,
        message
);
```
###**_Message Configurations_**
TBD

You can preview read slack message documentation and preview messages [here](https://api.slack.com/docs/messages)

###**_Usage_**
In order to be able to send slack messages you need to create an Webhook on your slack workspace (follow the instructions [here](https://my.slack.com/services/new/incoming-webhook/)) and use the webhook generated .
