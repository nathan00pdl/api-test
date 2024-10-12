package com.example.api_test.Feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.api_test.Domain.Book;

@FeignClient(name = "book-api", url = "https://book-example-api.s3.amazonaws.com/")
public interface BookClient {

    @GetMapping("books.json")
    List<Book>getBooks(){
    }
}
