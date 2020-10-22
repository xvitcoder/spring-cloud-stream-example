package com.xvitcoder.messaging.consumer.messaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface BookProcessOutputMessageChannel {
    String OUTPUT = "bookProcessOutput";

    @Output(BookProcessOutputMessageChannel.OUTPUT)
    MessageChannel output();
}
