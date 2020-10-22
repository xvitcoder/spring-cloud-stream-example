package com.xvitcoder.messaging.publisher.service;

import com.xvitcoder.messaging.publisher.domain.Book;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

@Slf4j
@Service
@RequiredArgsConstructor
public class BookStoreService {
    private final MessagingService messagingService;

    private Random random = new Random();
    private Long nextValue = 1L;

    public Book orderBook(Book book) {
        // Order book
        book.setId(nextValue++);
        book.setIsbn(String.valueOf(random.nextLong()));

        // Send book for process
        messagingService.sendBookOrder(book);

        return book;
    }
}
