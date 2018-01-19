package io.mb.slack.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.mb.slack.entity.SlackContext;
import io.mb.slack.entity.SlackMessage;
import lombok.NonNull;

public class SlackMessengerService {

    private static final Client client = ClientBuilder.newClient();
    private static final String JSON_MEDIA_TYPE = MediaType.APPLICATION_JSON;

    public static Response sendMessage(@NonNull SlackContext context, @NonNull SlackMessage message) {
        return client
            .target(context.getEndpoint())
            .request(JSON_MEDIA_TYPE)
            .post(Entity.entity(message, JSON_MEDIA_TYPE));
    }
}
