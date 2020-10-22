package com.xvitcoder.messaging.publisher.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface BookProcessInputMessageChannel {
    String INPUT = "bookProcessInput";

    @Input(BookProcessInputMessageChannel.INPUT)
    SubscribableChannel input();
}
