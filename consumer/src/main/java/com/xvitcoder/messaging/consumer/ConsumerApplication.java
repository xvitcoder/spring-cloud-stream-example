package com.xvitcoder.messaging.consumer;

import com.xvitcoder.messaging.consumer.messaging.BookOrderInputMessageChannel;
import com.xvitcoder.messaging.consumer.messaging.BookProcessOutputMessageChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding({
        BookOrderInputMessageChannel.class,
        BookProcessOutputMessageChannel.class
})
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
