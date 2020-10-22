package com.xvitcoder.messaging.publisher.messaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface BookOrderOutputMessageChannel {
    String OUTPUT = "bookOrderOutput";

    @Output(BookOrderOutputMessageChannel.OUTPUT)
    MessageChannel output();
}
