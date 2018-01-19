package io.mb.slack.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackMessage {

    @NonNull
    @JsonProperty("channel")
    private String to;

    @JsonProperty("username")
    private String from;

    @NonNull
    @JsonProperty("text")
    private String messageContent;

    @JsonProperty("icon_emoji")
    private String messageIcon;
}
