package com.example.api_test.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.api_test.Domain.Book;
import com.example.api_test.Feign.BookClient;

@Service
public class BookService {

    private BookClient bookClient;

    public BookService(BookClient client){
        this.bookClient = client;
    }

    public List<Book> getBooksFromLibrary(){
        return this.bookClient.getBooks();
    }
}   
