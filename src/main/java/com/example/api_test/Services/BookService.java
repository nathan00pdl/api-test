package com.example.api_test.Services;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.example.api_test.Domain.Book;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.stereotype.Service;

@Service
public class BookService {    
    ObjectMapper objectMapper = new ObjectMapper();  //converte objetos java para JSON e vice-versa

    public List<Book> getBooksFromLibrary() {
        try {
            File booksFilePath = new File("/home/nathan/Documentos/programming/vscode/ws_codigos_estudo_java/api-test/src/main/resources/static/books.json");
            return objectMapper.readValue(booksFilePath, new TypeReference<List<Book>>() {});  //leitura do JSON e transformação para uma lista de livros
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}   
