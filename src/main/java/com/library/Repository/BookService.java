package com.library.Repository;

import com.library.service.BookRepository;

public class BookService {
	private BookRepository bookRepository;

    // Setter method for Dependency Injection (Exercise 2)
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void performService() {
        System.out.println("BookService: Service task started.");
        if (bookRepository != null) {
            bookRepository.performRepositoryTask();
        } else {
            System.out.println("BookRepository was not injected!");
        }
    }
}


