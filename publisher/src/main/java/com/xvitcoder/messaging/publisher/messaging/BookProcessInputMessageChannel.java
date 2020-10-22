package com.xvitcoder.messaging.publisher.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface BookProcessInputMessageChannel {
    String INPUT = "bookProcessInput";

    @Input(BookProcessInputMessageChannel.INPUT)
    MessageChannel input();
}
