package com.xvitcoder.messaging.consumer.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface BookOrderInputMessageChannel {
    String INPUT = "bookOrderInput";

    @Input(BookOrderInputMessageChannel.INPUT)
    MessageChannel input();
}
