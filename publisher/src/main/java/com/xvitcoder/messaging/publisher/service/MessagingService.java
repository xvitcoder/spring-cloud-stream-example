package com.xvitcoder.messaging.publisher.service;

import com.xvitcoder.messaging.publisher.domain.Book;
import com.xvitcoder.messaging.publisher.messaging.BookOrderOutputMessageChannel;
import com.xvitcoder.messaging.publisher.messaging.BookProcessInputMessageChannel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MessagingService {

    private final BookOrderOutputMessageChannel bookOrderOutputMessageChannel;

    public void sendBookOrder(Book book) {
        log.info("Sending book order: {}", book);
        bookOrderOutputMessageChannel.output().send(MessageBuilder.withPayload(book).build());
    }

    @StreamListener(BookProcessInputMessageChannel.INPUT)
    public void receiveProcessedBook(Book book) {
        log.info("Received processed book: {}", book);
    }
}
