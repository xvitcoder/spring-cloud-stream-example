package com.xvitcoder.messaging.consumer.service;

import com.xvitcoder.messaging.consumer.domain.Book;
import com.xvitcoder.messaging.consumer.messaging.BookOrderInputMessageChannel;
import com.xvitcoder.messaging.consumer.messaging.BookProcessOutputMessageChannel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MessagingService {

    private final BookProcessOutputMessageChannel bookProcessOutputMessageChannel;

    private final OrderService orderService;

    @StreamListener(BookOrderInputMessageChannel.INPUT)
    public void receiveBookOrder(Book book) {
        log.info("Received book order: {}", book);
        orderService.orderBook(book);
    }

    public void sendBookProcessed(Book book) {
        log.info("Sending processed book: {}", book);
        bookProcessOutputMessageChannel.output().send(MessageBuilder.withPayload(book).build());
    }
}
