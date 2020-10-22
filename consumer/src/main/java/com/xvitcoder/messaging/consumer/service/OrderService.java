package com.xvitcoder.messaging.consumer.service;

import com.xvitcoder.messaging.consumer.domain.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {

    private final MessagingService messagingService;

    @Lazy
    public OrderService(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    public Book orderBook(Book book) {
        log.info("Order book: {}", book);
        book.setStatus("ORDERED");

        messagingService.sendBookProcessed(book);

        return book;
    }
}
