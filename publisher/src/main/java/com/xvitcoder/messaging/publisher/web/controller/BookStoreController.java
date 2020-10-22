package com.xvitcoder.messaging.publisher.web.controller;

import com.xvitcoder.messaging.publisher.domain.Book;
import com.xvitcoder.messaging.publisher.service.BookStoreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/book-store")
@RequiredArgsConstructor
public class BookStoreController {

    private final BookStoreService bookStoreService;

    @PostMapping("/order")
    public Book orderBook(@RequestBody Book book) {
        return bookStoreService.orderBook(book);
    }
}
