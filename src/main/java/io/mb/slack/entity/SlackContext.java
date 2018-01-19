package io.mb.slack.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NonNull;
import lombok.Setter;

@Data(staticConstructor = "fromEndpoint")
@Setter(AccessLevel.PRIVATE)
public class SlackContext {

    @NonNull
    private String endpoint;

}
