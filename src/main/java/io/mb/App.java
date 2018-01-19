package io.mb;

import io.mb.slack.entity.SlackContext;
import io.mb.slack.entity.SlackMessage;
import io.mb.slack.service.SlackMessengerService;

public class App {

    public static void main(String[] args) {
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
    }
}
