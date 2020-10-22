package com.xvitcoder.messaging.publisher;

import com.xvitcoder.messaging.publisher.messaging.BookOrderOutputMessageChannel;
import com.xvitcoder.messaging.publisher.messaging.BookProcessInputMessageChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding({
        BookOrderOutputMessageChannel.class,
        BookProcessInputMessageChannel.class
})
public class PublisherApplication {

    public static void main(String[] args) {
        SpringApplication.run(PublisherApplication.class, args);
    }

}

